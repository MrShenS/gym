package com.sz.gym.service.impl;

import com.sz.gym.dao.CustomerMapper;
import com.sz.gym.dao.EmployeeMapper;
import com.sz.gym.dao.FacilitiesMapper;
import com.sz.gym.model.dto.FacilitiesRatioDTO;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.dto.HeaderNumberDTO;
import com.sz.gym.model.entity.*;
import com.sz.gym.service.DashboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassNameDashboardServiceImpl
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/119:52
 * @Version 1.0
 */
@Service
@Slf4j
public class DashboardServiceImpl implements DashboardService {

    static final String SUCCESS="success";

    static final String LOSER="loser";

    @Autowired
    public EmployeeMapper employeeMapper;
    @Autowired
    public FacilitiesMapper facilitiesMapper;
    @Autowired
    public CustomerMapper customerMapper;


    @Override
    public BaseVO<HeaderNumberDTO> getHeaderNumber() {
        log.info("获取首页的数量信息");
        List<Customer> customers = customerMapper.selectByExample(new CustomerExample());
        List<Facilities> facilities = facilitiesMapper.selectByExample(new FacilitiesExample());
        List<Employee> employees = employeeMapper.selectByExample(new EmployeeExample());
        HeaderNumberDTO headerNumberDTO = new HeaderNumberDTO(employees.size(), facilities.size(), customers.size());
        BaseVO<HeaderNumberDTO> headerNumberDTOBaseVO = new BaseVO<>(SUCCESS, "查询成功", headerNumberDTO);
        return headerNumberDTOBaseVO;
    }

    @Transactional
//    @Cacheable(value = "redisCache", key = "'redis_getFacilitiesRatio'")
    @Override
    public BaseVO<List<FacilitiesRatioDTO>> getFacilitiesRatio() {
        log.info("==================获取首页的数量信息========Service================");
        final String type1="有氧健身器械";
        final String type2="无氧健身器械";
        final String type3="特殊器械";
        List<Facilities> facilities = facilitiesMapper.selectByExample(new FacilitiesExample());
        ArrayList<Facilities> facilitiesByType1 = new ArrayList<>();
        ArrayList<Facilities> facilitiesByType2 = new ArrayList<>();
        ArrayList<Facilities> facilitiesByType3 = new ArrayList<>();
        for (Facilities f :facilities) {
            switch (f.getFacilitiesType()){
                case type1:facilitiesByType1.add(f);break;
                case type2:facilitiesByType2.add(f);break;
                case type3:facilitiesByType3.add(f);break;
            }
        }
        int sum = facilities.size();
        System.out.println("SUM======"+sum);
        System.out.println("facilitiesByType1======"+facilitiesByType1.size());
        System.out.println("facilitiesByType2======"+facilitiesByType2.size());
        System.out.println("facilitiesByType3======"+facilitiesByType3.size());

        log.debug("=======================计算不同的比列==============================");
        //有氧健身比例
        FacilitiesRatioDTO facilitiesRatioDTO1 =
                new FacilitiesRatioDTO(type1,
                        Math.round(facilitiesByType1.size() * 100/ sum),"green");
        log.debug("==================有氧健身："+facilitiesByType1.size() * 100/ sum);
        //无氧健身比例
        FacilitiesRatioDTO facilitiesRatioDTO2 =
                new FacilitiesRatioDTO(type2,
                        Math.round(facilitiesByType2.size()* 100 / sum ),"red");
        //特殊健身器材比例
        FacilitiesRatioDTO facilitiesRatioDTO3 =
                new FacilitiesRatioDTO(type3,
                        Math.round(facilitiesByType3.size() * 100 / sum ),"blue");
        List<FacilitiesRatioDTO> ratioDTOS = Arrays.asList(facilitiesRatioDTO1, facilitiesRatioDTO2, facilitiesRatioDTO3);
        return new BaseVO<List<FacilitiesRatioDTO>>(SUCCESS,"成功",ratioDTOS);
    }
}
