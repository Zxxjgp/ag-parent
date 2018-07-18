package com.github.wxiaoqi.common.msg.auth;

import com.github.wxiaoqi.common.constant.RestCodeConstants;
import com.github.wxiaoqi.common.msg.BaseResponse;

/**
 * Created by ace on 2017/8/25.
 */
public class TokenForbiddenResponse  extends BaseResponse {
    public TokenForbiddenResponse(String message) {
        super(RestCodeConstants.EX_TOKEN_ERROR_CODE, message);
    }
}
