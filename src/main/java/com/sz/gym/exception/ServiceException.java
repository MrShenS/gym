package com.sz.gym.exception;

import org.springframework.http.HttpStatus;

/**
 * @ClassNameServiceException
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1013:20
 * @Version 1.0
 */
public class ServiceException extends GymException {

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}