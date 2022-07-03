package com.atqgh.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 角色和菜单关联表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@ApiModel
@Data
public class SysRoleMenuQueryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID.
     */
    @ApiModelProperty("角色ID")
    private String roleCode;

    /**
     * 菜单ID.
     */
    @ApiModelProperty("菜单ID")
    private String menuCode;

}
