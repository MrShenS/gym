package com.sz.gym.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassNameProductOfCustomer
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1611:21
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductOfCustomer {
    private  String productName;
    private int number;
}
