package com.atqgh.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;
import javax.validation.constraints.NotNull;

/**
 * 用户和角色关联表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@ApiModel
@Data
public class SysUserRoleAddVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户ID")
    @NotNull
    private Long userId;

    @ApiModelProperty("角色ID")
    @NotNull
    private Long roleId;

}
