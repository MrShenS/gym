package com.sz.gym.model.param;

import com.sz.gym.model.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassNameCustomerParam
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1519:20
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerParam {
    private Customer customer;
    private List<String> address;
}
