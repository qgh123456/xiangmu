package com.atqgh.security.factory;

import com.atqgh.common.utils.ResultObj;
import com.atqgh.security.feign.UserFeignClient;
import feign.hystrix.FallbackFactory;

/**
 * 远程调用
 * @author Mubai
 * @date 2022/7/2 11:19 下午
 **/
public class SystemUserFallbackFactory implements FallbackFactory<UserFeignClient> {


    @Override
    public UserFeignClient create(Throwable throwable) {
        return new UserFeignClient() {

            @Override
            public ResultObj findByUsername(String username) {
                return null;
            }
        };
    }
}
