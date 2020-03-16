package com.sz.gym.service.impl;

import com.sz.gym.dao.CustomerMapper;
import com.sz.gym.dao.ProductCustomerMapper;
import com.sz.gym.dao.ProductMapper;
import com.sz.gym.exception.CustomerException;
import com.sz.gym.model.dto.CustomerWithProductDTO;
import com.sz.gym.model.dto.ProductOfCustomer;
import com.sz.gym.model.entity.*;
import com.sz.gym.model.enums.ConstantEnum;
import com.sz.gym.model.param.CustomerParam;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassNameCustomerServiceImpl
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1518:13
 * @Version 1.0
 */
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    public CustomerMapper customerMapper;

    @Autowired
    public ProductCustomerMapper productCustomerMapper;

    @Autowired
    public ProductMapper productMapper;

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

    @Override
    @Transactional
    public BaseVO<Customer> saveCustomer(CustomerParam customerParam) {
        if(customerParam==null){
            throw new CustomerException("接受对象出现问题");
        }
        Customer customer = customerParam.getCustomer();
        CustomerExample customerExample = new CustomerExample();
        customerExample.createCriteria().andCustomerPhoneEqualTo(customer.getCustomerPhone());
        List<Customer> customers = customerMapper.selectByExample(customerExample);
        if(customers.size()!=0){
            throw new CustomerException("客户已存在");
        }
        try {
            List<String> address = customerParam.getAddress();
            String customerAddress = "";
            for (String a:address) {
                customerAddress+=a;
            }
            customer.setCreateTime(new Date());
            customer.setUpdateTime(new Date());
            customer.setCustomerAddress(customerAddress);
            int insert = customerMapper.insert(customer);
        }catch (Exception e){
            throw new CustomerException("保存用户报错");
        }

        return new BaseVO<Customer>(ConstantEnum.success.toString(),"欢迎"+customer.getCustomerName()+"加入明天会更好俱乐部 鼓掌",customer);
    }

    @Override
    @Transactional
    @Cacheable(value = "redisCache", key = "'redis_getCustomerAllDetail_'+#phone")
    public BaseVO<CustomerWithProductDTO> getCustomerAllDetail(String phone) {
        ProductOfCustomer productOfCustomer=null;
        ArrayList<ProductOfCustomer> productOfCustomers = new ArrayList<>();
        CustomerExample customerExample = new CustomerExample();
        customerExample.createCriteria().andCustomerPhoneEqualTo(phone);
        List<Customer> customers = customerMapper.selectByExample(customerExample);
        if(customers.size()!=1){
            log.error("输入电话号有误 请检查");
            throw new CustomerException("输入电话号有误");
        }
        log.debug("获取用户");
        Customer customer = customers.get(0);
        ProductCustomerExample productCustomerExample = new ProductCustomerExample();
        productCustomerExample.createCriteria().andCustomerIdEqualTo(customer.getCustomerId());
        log.debug("获取和该用户有关系的产品列表");
        List<ProductCustomer> productCustomers = productCustomerMapper.selectByExample(productCustomerExample);
        log.debug("将产品添加到对应的集合");
        for (ProductCustomer productCustomer :
             productCustomers) {
            productOfCustomer=new ProductOfCustomer(
                    productMapper.selectByPrimaryKey(productCustomer.getId()).getProductName(),
                    productCustomer.getNumber());
            productOfCustomers.add(productOfCustomer);
        }
        return new BaseVO<CustomerWithProductDTO>(ConstantEnum.success.toString(),"查询成功",
                new CustomerWithProductDTO(productOfCustomers,customer));
    }

    @Override
    public BaseVO<Customer> updateCustomer(Customer customer) {
        customerMapper.updateByPrimaryKey(customer);
        return new BaseVO<Customer>(ConstantEnum.success.toString(),"修改成功",customer);
    }

    @Override
    public BaseVO<TableShowVO<Customer>> getCustomerByQueryParam(String name, String address) {
        CustomerExample customerExample = new CustomerExample();
        customerExample.createCriteria().andCustomerNameLike("%"+name+"%")
                .andCustomerAddressLike("%"+address+"%");
        List<Customer> customers = customerMapper.selectByExample(customerExample);
        return new BaseVO<TableShowVO<Customer>>(ConstantEnum.success.toString(),"查询成功",
                new TableShowVO<Customer>(customers,customers.size()));
    }
}
