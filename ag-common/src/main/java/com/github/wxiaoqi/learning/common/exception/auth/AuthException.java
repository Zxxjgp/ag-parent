package com.github.wxiaoqi.learning.common.exception.auth;

import com.github.wxiaoqi.learning.common.exception.BaseException;

public class AuthException extends BaseException {
    private static  final Integer AUTH_USER_EXCEPTION = 401401;

    public AuthException(String message, int states) {
        super(message, states);
    }
}
