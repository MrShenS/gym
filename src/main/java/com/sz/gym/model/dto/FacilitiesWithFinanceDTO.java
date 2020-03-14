package com.sz.gym.model.dto;

import com.sz.gym.model.entity.Facilities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassNameFacilitiesFinanceDTO
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1410:08
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacilitiesWithFinanceDTO {
    private String financeName;
    private String financeDestription;
    private Facilities facilities;
}
