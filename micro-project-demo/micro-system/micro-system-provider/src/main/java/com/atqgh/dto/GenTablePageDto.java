package com.atqgh.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 代码生成业务表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:08
 */
@ApiModel
@Data
public class GenTablePageDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号.
     */
    @ApiModelProperty("编号")
    private Long id;

    /**
     * 表名称.
     */
    @ApiModelProperty("表名称")
    private String tableName;

    /**
     * 表描述.
     */
    @ApiModelProperty("表描述")
    private String tableComment;

    /**
     * 关联子表的表名.
     */
    @ApiModelProperty("关联子表的表名")
    private String subTableName;

    /**
     * 子表关联的外键名.
     */
    @ApiModelProperty("子表关联的外键名")
    private String subTableFkName;

    /**
     * 实体类名称.
     */
    @ApiModelProperty("实体类名称")
    private String className;

    /**
     * 使用的模板（crud单表操作 tree树表操作）.
     */
    @ApiModelProperty("使用的模板（crud单表操作 tree树表操作）")
    private String tplCategory;

    /**
     * 生成包路径.
     */
    @ApiModelProperty("生成包路径")
    private String packageName;

    /**
     * 生成模块名.
     */
    @ApiModelProperty("生成模块名")
    private String moduleName;

    /**
     * 生成业务名.
     */
    @ApiModelProperty("生成业务名")
    private String businessName;

    /**
     * 生成功能名.
     */
    @ApiModelProperty("生成功能名")
    private String functionName;

    /**
     * 生成功能作者.
     */
    @ApiModelProperty("生成功能作者")
    private String functionAuthor;

    /**
     * 生成代码方式（0zip压缩包 1自定义路径）.
     */
    @ApiModelProperty("生成代码方式（0zip压缩包 1自定义路径）")
    private String genType;

    /**
     * 生成路径（不填默认项目路径）.
     */
    @ApiModelProperty("生成路径（不填默认项目路径）")
    private String genPath;

    /**
     * 其它生成选项.
     */
    @ApiModelProperty("其它生成选项")
    private String options;

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
