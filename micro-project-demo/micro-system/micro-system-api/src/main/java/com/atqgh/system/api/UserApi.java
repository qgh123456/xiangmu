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

    /**
     * 通过用户编码获取所有的角色.
     *
     * @param userCode 用户编码
     * @return 详情信息
     */
    @GetMapping("/sysRole/getRolesByUserCode/{userCode}")
    ResultObj getRolesByUserCode(@PathVariable(value = "userCode") String userCode);

    /**
     * 通过用户编码获取对应的菜单.
     *
     * @param roleCode 用户编码
     * @return 获取菜单集合
     */
    @GetMapping("/sysMenu/getPermissions/{roleCode}")
    ResultObj getPermissions(String roleCode);

}
