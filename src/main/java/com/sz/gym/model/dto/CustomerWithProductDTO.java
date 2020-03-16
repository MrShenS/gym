package com.sz.gym.model.dto;

import com.sz.gym.model.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassNameCustomerWithProductDTO
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1611:15
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerWithProductDTO {
    private List<ProductOfCustomer> products;
    private Customer customer;
}
