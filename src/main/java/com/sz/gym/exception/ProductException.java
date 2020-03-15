package com.sz.gym.exception;

/**
 * @ClassNameProductException
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1013:20
 * @Version 1.0
 */
public class ProductException extends ServiceException {
    public ProductException(String message) {
        super(message);
    }

    public ProductException(String message, Throwable cause) {
        super(message, cause);
    }
}
