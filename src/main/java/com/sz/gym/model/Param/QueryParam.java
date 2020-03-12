package com.sz.gym.model.Param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassNameQueryParam
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1213:52
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryParam {
    public String employeeName;
    public String employeeAddress;
}
