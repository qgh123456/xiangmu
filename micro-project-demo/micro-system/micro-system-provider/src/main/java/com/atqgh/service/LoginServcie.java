package com.atqgh.service;

import com.atqgh.common.utils.ResultObj;
import com.atqgh.entity.SysUser;

/**
 * 用户信息.
 * @author Mubai
 * @date 2022/7/11 9:38 下午
 **/
public interface LoginServcie {

    /**
     * 登陆.
     * @param sysUser 用户
     * @return 结果
     */
    ResultObj login(SysUser sysUser);

    /**
     * 退出登陆的方法.
     *
     * @return 退出
     */
    ResultObj logout();
}
