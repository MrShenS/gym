package com.sz.gym.utils;

import java.util.UUID;

/**
 * @ClassNameUuidUtils
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1716:49
 * @Version 1.0
 */
public class UuidUtils {
    public static String getUUID32(){
    String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
     return uuid;
//  return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

}
