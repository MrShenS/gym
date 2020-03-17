package com.sz.gym.exception;

/**
 * @ClassNameEmployeeException
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1013:20
 * @Version 1.0
 */
public class FileServiceException extends ServiceException {
    public FileServiceException(String message) {
        super(message);
    }

    public FileServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
