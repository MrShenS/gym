package com.sz.gym.exception;

import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * @ClassNamewe
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1013:06
 * @Version 1.0
 */
public abstract class GymException extends RuntimeException {

    /**
     * Error errorData.
     */
    private Object errorData;

    public GymException(String message) {
        super(message);
    }

    public GymException(String message, Throwable cause) {
        super(message, cause);
    }

    @NonNull
    public abstract HttpStatus getStatus();

    @Nullable
    public Object getErrorData() {
        return errorData;
    }

    /**
     * Sets error errorData.
     *
     * @param errorData error data
     * @return current exception.
     */
    @NonNull
    public GymException setErrorData(@Nullable Object errorData) {
        this.errorData = errorData;
        return this;
    }
}

