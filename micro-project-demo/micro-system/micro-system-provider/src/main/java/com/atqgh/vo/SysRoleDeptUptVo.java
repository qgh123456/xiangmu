package com.atqgh.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;
import javax.validation.constraints.NotNull;

/**
 * 角色和部门关联表.
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@ApiModel
@Data
public class SysRoleDeptUptVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("角色ID")
    @NotNull
    private Long roleId;

    @ApiModelProperty("部门ID")
    @NotNull
    private Long deptId;

}
