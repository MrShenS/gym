package com.sz.gym.model.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @ClassNameBetweenDate
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1613:06
 * @Version 1.0
 */
@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class BetweenDate {
    Date data1;
    Date data2;
}
