package com.sz.gym.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @ClassNamebaseDto
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1010:08
 * @Version 1.0
 */
@Data
@Repository
@NoArgsConstructor
@AllArgsConstructor
public class BaseVO<T> {
    public String status;
    public String message;
    public T obj;

}
