package com.sz.gym.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassNameActivityUpdateStatusVO
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1418:57
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityUpdateStatusVO<T> {
    private List<T> doings;
    private List<T> todDoing;
    private List<T> done;
}
