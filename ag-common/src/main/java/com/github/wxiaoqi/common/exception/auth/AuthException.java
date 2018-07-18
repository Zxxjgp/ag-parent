package com.github.wxiaoqi.common.exception.auth;

import com.github.wxiaoqi.common.constant.RestCodeConstants;
import com.github.wxiaoqi.common.exception.BaseException;

public class AuthException extends BaseException {
    public AuthException(String message, int states) {
        super(message, RestCodeConstants.EX_TOKEN_ERROR_CODE);
    }
}
