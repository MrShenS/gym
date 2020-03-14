package com.sz.gym.model.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassNameloginVO
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1011:16
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginParam {
    public String username;
    public  String password;
}
