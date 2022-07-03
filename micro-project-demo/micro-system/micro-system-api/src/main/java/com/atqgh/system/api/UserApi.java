package com.atqgh.system.api;

import com.atqgh.common.utils.ResultObj;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 用户详情接口
 * @author Mubai
 * @date 2022/7/2 11:16 下午
 **/
public interface UserApi {

    /**
     * 查看用户信息.
     *
     * @param username 用户名字
     * @return 详情信息
     */
    @GetMapping("/sysUser/findByUsername/{username}")
    ResultObj findByUsername(@PathVariable(value = "username") String username);


}
