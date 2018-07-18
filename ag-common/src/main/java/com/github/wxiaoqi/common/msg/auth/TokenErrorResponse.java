package com.github.wxiaoqi.common.msg.auth;

import com.github.wxiaoqi.common.constant.RestCodeConstants;
import com.github.wxiaoqi.common.msg.BaseResponse;

/**
 * Created by ace on 2017/8/23.
 */
public class TokenErrorResponse extends BaseResponse {
    public TokenErrorResponse(String message) {
        super(RestCodeConstants.EX_OTHER_CODE, message);
    }
}
