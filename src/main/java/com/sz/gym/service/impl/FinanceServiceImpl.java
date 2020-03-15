package com.sz.gym.service.impl;

import com.sz.gym.dao.FinanceMapper;
import com.sz.gym.exception.FinanceException;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.entity.Finance;
import com.sz.gym.model.enums.ConstantEnum;
import com.sz.gym.service.FinanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @ClassNameFinanceServiceImpl
 * @Description TODO 处理财务报表相关信息
 * @Author zhen.zhen
 * @Date 2020/3/1410:18
 * @Version 1.0
 */
@Service
@Slf4j
public class FinanceServiceImpl implements FinanceService {



    @Autowired
    public FinanceMapper financeMapper;

    @Override
    @Transactional
    public BaseVO<Finance> addFinanceRecord(Finance finance) {
        try {
            finance.setCreateTime(new Date());
            log.info(finance.toString());
            int insert = financeMapper.insert(finance);
        }catch (Exception e){
            log.error("增加财政记录报错");
            e.printStackTrace();
            throw new FinanceException("财务流水表出现错误");
        }
        log.info("添加财政表成功");
        return new BaseVO<Finance>(ConstantEnum.success.toString(),"添加成功",finance);
    }

    @Override
    public Finance getFinance(String financeName, String financeDescription, String type,String reclassify, double money) {
        Finance finance = new Finance();
        finance.setCreateTime(new Date());
        finance.setFinanceDescription(financeDescription);
        finance.setFinanceType(type);
        finance.setMoney(money);
        finance.setFinanceReclassify(reclassify);
        finance.setFinanceName(financeName);
        return finance;
    }
}
