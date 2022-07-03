package com.atqgh.security.feign;

import com.atqgh.security.factory.SystemUserFallbackFactory;
import com.atqgh.system.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(contextId = "userFeignClient", value = "micro-system-provider", path = "/system", fallbackFactory = SystemUserFallbackFactory.class)
public interface UserFeignClient extends UserApi {

}
