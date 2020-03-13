package com.sz.gym.model.VO;

import com.sz.gym.model.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassNameemployeeShowVO
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1210:38
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableShowVO<T> {
    public List<T> list;
    public int num;
}
