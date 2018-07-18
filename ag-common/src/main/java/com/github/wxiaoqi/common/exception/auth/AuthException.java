package com.github.wxiaoqi.common.exception.auth;

import com.github.wxiaoqi.common.exception.BaseException;

public class AuthException extends BaseException {
    private static  final Integer AUTH_USER_EXCEPTION = 401401;

    public AuthException(String message, int states) {
        super(message, states);
    }
}
