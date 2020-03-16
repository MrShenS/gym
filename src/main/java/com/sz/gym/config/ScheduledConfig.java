package com.sz.gym.config;

import com.sz.gym.dao.CustomerMapper;
import com.sz.gym.model.entity.Customer;
import com.sz.gym.model.entity.CustomerExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassNameScheduledConfig
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1618:21
 * @Version 1.0
 */
@Component
@Slf4j
public class ScheduledConfig {


    @Autowired
    public CustomerMapper customerMapper;

    @Scheduled(cron = "* * 3 * * *")
    @Transactional
    public void checkCustomer(){
        log.info("=====>>>>会员时间减一  {}",System.currentTimeMillis());
        List<Customer> customers = customerMapper.selectByExample(new CustomerExample());
        for (Customer customer:customers){
            String customerResiduetime = customer.getCustomerResiduetime();
            int endTime = Integer.parseInt(customerResiduetime);
            endTime-=1;
            customer.setCustomerResiduetime(endTime+"");
            customerMapper.updateByPrimaryKey(customer);
        }
    }


}
