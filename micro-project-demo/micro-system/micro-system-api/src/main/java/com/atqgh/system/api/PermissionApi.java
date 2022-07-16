package com.atqgh.system.api;

import com.atqgh.common.utils.ResultObj;

/**
 * @author Mubai
 * @date 2022/7/4 10:23 上午
 **/
public interface PermissionApi {

    ResultObj getPermissions(String roleCode);
}
