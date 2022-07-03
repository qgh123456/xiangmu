package com.atqgh.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 菜单权限表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@ApiModel
@Data
public class SysMenuPageDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单ID.
     */
    @ApiModelProperty("菜单ID")
    private Long id;

    /**
     * 菜单编码.
     */
    @ApiModelProperty("菜单编码")
    private String menuCode;

    /**
     * 菜单名称.
     */
    @ApiModelProperty("菜单名称")
    private String menuName;

    /**
     * 父菜单编码.
     */
    @ApiModelProperty("父菜单编码")
    private String parentCode;

    /**
     * 显示顺序.
     */
    @ApiModelProperty("显示顺序")
    private Integer orderNum;

    /**
     * 路由地址.
     */
    @ApiModelProperty("路由地址")
    private String path;

    /**
     * 组件路径.
     */
    @ApiModelProperty("组件路径")
    private String component;

    /**
     * 路由参数.
     */
    @ApiModelProperty("路由参数")
    private String query;

    /**
     * 是否为外链（0是 1否）.
     */
    @ApiModelProperty("是否为外链（0是 1否）")
    private Integer isFrame;

    /**
     * 是否缓存（0缓存 1不缓存）.
     */
    @ApiModelProperty("是否缓存（0缓存 1不缓存）")
    private Integer isCache;

    /**
     * 菜单类型（M目录 C菜单 F按钮）.
     */
    @ApiModelProperty("菜单类型（M目录 C菜单 F按钮）")
    private String menuType;

    /**
     * 菜单状态（0显示 1隐藏）.
     */
    @ApiModelProperty("菜单状态（0显示 1隐藏）")
    private String visible;

    /**
     * 菜单状态（0正常 1停用）.
     */
    @ApiModelProperty("菜单状态（0正常 1停用）")
    private String status;

    /**
     * 权限标识.
     */
    @ApiModelProperty("权限标识")
    private String perms;

    /**
     * 菜单图标.
     */
    @ApiModelProperty("菜单图标")
    private String icon;

    /**
     * 创建者.
     */
    @ApiModelProperty("创建者")
    private String createBy;

    /**
     * 创建时间.
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 更新者.
     */
    @ApiModelProperty("更新者")
    private String updateBy;

    /**
     * 更新时间.
     */
    @ApiModelProperty("更新时间")
    private Date updateTime;

    /**
     * 备注.
     */
    @ApiModelProperty("备注")
    private String remark;

}
