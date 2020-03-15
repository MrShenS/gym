package com.sz.gym.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassNamefacilitiesRatioDTO
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1510:58
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacilitiesRatioDTO {
    private String facilitiesName;
    private double facilitiesRatio;
    private String color;
}
