package com.sz.gym.web.controller;

import com.sz.gym.exception.CustomerException;
import com.sz.gym.model.dto.CustomerWithProductDTO;
import com.sz.gym.model.entity.Customer;
import com.sz.gym.model.enums.ConstantEnum;
import com.sz.gym.model.param.CustomerParam;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class CustomerController {


    @Autowired
    public CustomerService customerService;



    @GetMapping
    public BaseVO<TableShowVO<Customer>> getCustomerAll(){
        return customerService.getAllCustomer();
    }



    @GetMapping("/getCustomerDetail")
    public BaseVO<CustomerWithProductDTO> getCustomerAllDetail(@RequestParam String phone){
        return customerService.getCustomerAllDetail(phone);
    }



    @GetMapping("/getCustomerByQueryParam")
    public BaseVO<TableShowVO<Customer>> getCustomerByQueryParam(@RequestParam String name,@RequestParam String address){
        return customerService.getCustomerByQueryParam(name,address);
    }

    @PutMapping()
    public BaseVO<Customer> updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping
    public BaseVO<Customer> deleteCustomer(@RequestBody Customer customer){
        return customerService.deleteCustomer(customer);
    }

    @PostMapping
    public BaseVO<Customer> addCustomer(@RequestBody CustomerParam customerParam){
        BaseVO<Customer> customerBaseVO=null;
        try {
            customerBaseVO=customerService.saveCustomer(customerParam);
        }catch (Exception e){
            log.error(e.getMessage());
            return new BaseVO<Customer>(ConstantEnum.lower.toString(),e.getMessage(),customerParam.getCustomer());
        }
        return customerBaseVO;
    }

}
