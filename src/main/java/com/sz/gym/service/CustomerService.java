package com.sz.gym.service;

import com.sz.gym.model.dto.CustomerWithProductDTO;
import com.sz.gym.model.entity.Customer;
import com.sz.gym.model.param.CustomerParam;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassNameCustomerService
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1518:09
 * @Version 1.0
 */
@Service
public interface CustomerService {
    BaseVO<TableShowVO<Customer>> getAllCustomer();

    BaseVO<Customer> deleteCustomer(Customer customer);

    BaseVO<Customer> saveCustomer(CustomerParam customerParam);


    BaseVO<CustomerWithProductDTO> getCustomerAllDetail(String phone);

    BaseVO<Customer> updateCustomer(Customer customer);

    BaseVO<TableShowVO<Customer>> getCustomerByQueryParam(String name, String address);
}
