package com.chat_blog.java_agi.exception;

/**
 * @Author :wuxiaodong
 * @Date: 2023/3/16 15:56
 * @Description:
 */
public class SessionNameRepeatException extends RuntimeException{
    public SessionNameRepeatException(String message) {
        super(message);
    }
}
