package com.atqgh.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户和角色关联表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@ApiModel
@Data
public class SysUserRoleDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID.
     */
    @ApiModelProperty("用户ID")
    private Long userId;

    /**
     * 角色ID.
     */
    @ApiModelProperty("角色ID")
    private Long roleId;

}
