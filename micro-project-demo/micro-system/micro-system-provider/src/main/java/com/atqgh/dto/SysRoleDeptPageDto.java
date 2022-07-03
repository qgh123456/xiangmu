package com.atqgh.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 角色和部门关联表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@ApiModel
@Data
public class SysRoleDeptPageDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID.
     */
    @ApiModelProperty("角色ID")
    private String roleCode;

    /**
     * 部门ID.
     */
    @ApiModelProperty("部门ID")
    private String deptCode;

}
