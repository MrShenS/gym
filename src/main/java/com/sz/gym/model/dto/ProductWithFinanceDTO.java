package com.sz.gym.model.dto;

import com.sz.gym.model.entity.Facilities;
import com.sz.gym.model.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author zhen.shen
 * @Description //TODO
 * @Date 13:03 2020/3/15
 * @Param
 * @return
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductWithFinanceDTO {
    private String financeName;
    private String financeDescription;
    private Product product;
}
