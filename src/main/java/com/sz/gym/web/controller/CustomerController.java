package com.sz.gym.web.controller;

import com.sz.gym.model.entity.Customer;
import com.sz.gym.model.param.CustomerParam;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassNameCustomerController
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1518:09
 * @Version 1.0
 */
@RestController
@RequestMapping("/Customer")
@CrossOrigin
public class CustomerController {


    @Autowired
    public CustomerService customerService;



    @GetMapping
    public BaseVO<TableShowVO<Customer>> getCustomerAll(){
        return customerService.getAllCustomer();
    }


    @DeleteMapping
    public BaseVO<Customer> deleteCustomer(@RequestBody Customer customer){
        return customerService.deleteCustomer(customer);
    }

    @PostMapping
    public BaseVO<Customer> addCustomer(@RequestBody CustomerParam customerParam){
        return null;
    }

}
