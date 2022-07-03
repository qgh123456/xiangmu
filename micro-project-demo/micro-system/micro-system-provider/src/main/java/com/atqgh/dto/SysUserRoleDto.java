package com.atqgh.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户和角色关联表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@ApiModel
@Data
public class SysUserRoleDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID.
     */
    @ApiModelProperty("用户ID")
    private String userCode;

    /**
     * 角色ID.
     */
    @ApiModelProperty("角色ID")
    private String roleCode;

}
