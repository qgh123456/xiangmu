package com.atqgh.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;
import javax.validation.constraints.NotNull;

/**
 * 部门表.
 * @author Mubai
 * @date 2022-07-03 15:31:10
 */
@ApiModel
@Data
public class SysDeptUptVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("部门id")
    @NotNull
    private Long deptId;

    @ApiModelProperty("父部门id")
    private Long parentId;

    @ApiModelProperty("祖级列表")
    private String ancestors;

    @ApiModelProperty("部门名称")
    private String deptName;

    @ApiModelProperty("显示顺序")
    private Integer orderNum;

    @ApiModelProperty("负责人")
    private String leader;

    @ApiModelProperty("联系电话")
    private String phone;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("部门状态（0正常 1停用）")
    private String status;

    @ApiModelProperty("删除标志（0代表存在 2代表删除）")
    private String delFlag;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

}
