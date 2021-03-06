package com.github.wxiaoqi.learning.uc.config;

import com.github.wxiaoqi.common.handler.GlobalExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: ag-parent
 * @Package: com.github.wxiaoqi.learning.uc.config
 * @ClassName: WebConfig
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/7/18 17:24
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/7/18 17:24
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Configuration
public class WebConfig {
    @Bean
    GlobalExceptionHandler getGlobalExceptionHandler(){
        return new GlobalExceptionHandler();
    }
}
