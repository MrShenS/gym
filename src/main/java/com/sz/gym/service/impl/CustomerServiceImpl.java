package com.sz.gym.service.impl;

import com.sz.gym.dao.CustomerMapper;
import com.sz.gym.dao.ProductCustomerMapper;
import com.sz.gym.exception.CustomerException;
import com.sz.gym.model.entity.*;
import com.sz.gym.model.enums.ConstantEnum;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassNameCustomerServiceImpl
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1518:13
 * @Version 1.0
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    public CustomerMapper customerMapper;

    @Autowired
    public ProductCustomerMapper productCustomerMapper;

    @Override
    public BaseVO<TableShowVO<Customer>> getAllCustomer() {
        List<Customer> customers = customerMapper.selectByExample(new CustomerExample());
        return new BaseVO<TableShowVO<Customer>>(ConstantEnum.success.toString(),"查询成功",
                new TableShowVO<Customer>(customers,customers.size()));
    }

    @Override
    @Transactional
    public BaseVO<Customer> deleteCustomer(Customer customer) {
        try {
            customerMapper.deleteByPrimaryKey(customer.getCustomerId());
            ProductCustomerExample productCustomerExample = new ProductCustomerExample();
            productCustomerExample.createCriteria().andCustomerIdEqualTo(customer.getCustomerId());
            productCustomerMapper.deleteByExample(productCustomerExample);
        }catch (Exception e){
            e.printStackTrace();
            throw new CustomerException("用户删除失败");
        }
        return new BaseVO<Customer>(ConstantEnum.success.toString(),"成功",customer);
    }
}
