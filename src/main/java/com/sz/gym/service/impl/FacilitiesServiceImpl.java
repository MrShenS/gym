package com.sz.gym.service.impl;

import com.sz.gym.dao.FacilitiesMapper;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.model.dto.FacilitiesWithFinanceDTO;
import com.sz.gym.model.entity.Facilities;
import com.sz.gym.model.entity.FacilitiesExample;
import com.sz.gym.model.entity.Finance;
import com.sz.gym.model.enums.ConstantEnum;
import com.sz.gym.service.FacilitiesService;
import com.sz.gym.service.FinanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @ClassNameFacilitiesServiceImpl
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1410:14
 * @Version 1.0
 */

@Service
@Slf4j
public class FacilitiesServiceImpl implements FacilitiesService {

    final String incomeType ="器材收入";
    final String disburseType ="器材支出";


    @Autowired
    public FacilitiesMapper facilitiesMapper;
    @Autowired
    public FinanceService financeService;




    @Override
    @Transactional
    public BaseVO<Facilities> saveFacilities(FacilitiesWithFinanceDTO facilitiesWithFinanceDTO) {
        log.info("提取器材对象");
        Facilities facilities = facilitiesWithFinanceDTO.getFacilities();
        try {

            log.debug("保存器材对象");
            facilities.setCreateTime(new Date());
            facilities.setUpdateTime(new Date());
            int insert = facilitiesMapper.insert(facilities);
            log.info("计算金额");
            double money = facilities.getNumber()*facilities.getPrice();
            log.debug("获取财政对象");
            Finance finance = financeService.getFinance(facilitiesWithFinanceDTO.getFinanceName(),
                    facilitiesWithFinanceDTO.getFinanceDestription(), ConstantEnum.disburse.toString(),
                    disburseType, money);
            log.debug("保存财政数据");
            financeService.addFinanceRecord(finance);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseVO<Facilities>(ConstantEnum.lower.toString(),"操作失败 请联系管理员",facilities);
        }


        return new BaseVO<Facilities>(ConstantEnum.success.toString(),"操作成功",facilities);
    }

    @Override
    @Transactional
    public BaseVO<Facilities> updateFacilities(FacilitiesWithFinanceDTO facilitiesWithFinanceDTO) {
        log.info("提取器材对象");
        Facilities facilities = facilitiesWithFinanceDTO.getFacilities();
        try {

            log.debug("=====================================判断财政操作类型===============================");
            log.debug("查询出原来的数量");
            Facilities selectByPrimaryKey = facilitiesMapper.selectByPrimaryKey(facilities.getId());
            Integer sourceNumber = selectByPrimaryKey.getNumber();
            Integer updateNumber = facilities.getNumber();
            if(sourceNumber!=updateNumber){
                log.info("计算金额");
                log.info("获取一级分类");
                String financeType = updateNumber>sourceNumber?
                        ConstantEnum.disburse.toString():ConstantEnum.income.toString();
                log.info("获取二级分类");
                String financeType2 = updateNumber>sourceNumber?
                        disburseType:incomeType;
                double money = (updateNumber-sourceNumber)*facilities.getPrice();
                log.debug("获取财政对象");
                Finance finance = financeService.getFinance(facilitiesWithFinanceDTO.getFinanceName(),
                        facilitiesWithFinanceDTO.getFinanceDestription(), financeType,
                        financeType2, money);

                log.debug("保存财政数据");
                financeService.addFinanceRecord(finance);
            }
            log.debug("更新器材对象");
            int i = facilitiesMapper.updateByPrimaryKey(facilities);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseVO<Facilities>(ConstantEnum.lower.toString(),"操作失败 请联系管理员",facilities);
        }
        return new BaseVO<Facilities>(ConstantEnum.success.toString(),"操作成功",facilities);
    }

    @Override
    @Transactional
    public BaseVO<Facilities> deleteFacilities(Facilities facilities) {
        try {
            log.info("计算出库的金额");
            double money = facilities.getNumber()*facilities.getPrice();
            Finance finance = financeService.getFinance("清空" + facilities.getFacilitiesName() + "库存", "全部删除"
                    , ConstantEnum.income.toString(), incomeType, money);
            log.info("存储账单");
            BaseVO<Finance> financeBaseVO = financeService.addFinanceRecord(finance);
            log.info("删除记录");
            int i = facilitiesMapper.deleteByPrimaryKey(facilities.getId());
        }catch (Exception e){
            log.error("此处出现错误");
            e.printStackTrace();
            return new BaseVO<Facilities>(ConstantEnum.lower.toString(),"删除失败",facilities);
        }

        return new BaseVO<Facilities>(ConstantEnum.success.toString(),"操作成功",facilities);
    }

    @Override
    public BaseVO<TableShowVO<Facilities>> selectFacilities() {
        List<Facilities> facilities = facilitiesMapper.selectByExample(new FacilitiesExample());

        return new BaseVO<TableShowVO<Facilities>>(ConstantEnum.success.toString(),"成功",
                new TableShowVO<Facilities>(facilities,facilities.size()));
    }
}
