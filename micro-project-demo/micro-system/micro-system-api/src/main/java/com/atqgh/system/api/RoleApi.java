package com.atqgh.system.api;

import com.atqgh.common.utils.ResultObj;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 获取角色的接口.
 * @author Mubai
 * @date 2022/7/2 11:16 下午
 **/
public interface RoleApi {

    /**
     * 通过用户编码获取所有的角色.
     *
     * @param userCode 用户编码
     * @return 详情信息
     */
    @GetMapping("/sysRole/getRolesByUserCode/{userCode}")
    ResultObj getRolesByUserCode(@PathVariable(value = "userCode") String userCode);

}
