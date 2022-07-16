package com.atqgh.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;
import javax.validation.constraints.NotNull;

/**
 * 代码生成业务表.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
@ApiModel
@Data
public class GenTableAddVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("编号")
    @NotNull
    private Long tableId;

    @ApiModelProperty("表名称")
    private String tableName;

    @ApiModelProperty("表描述")
    private String tableComment;

    @ApiModelProperty("关联子表的表名")
    private String subTableName;

    @ApiModelProperty("子表关联的外键名")
    private String subTableFkName;

    @ApiModelProperty("实体类名称")
    private String className;

    @ApiModelProperty("使用的模板（crud单表操作 tree树表操作）")
    private String tplCategory;

    @ApiModelProperty("生成包路径")
    private String packageName;

    @ApiModelProperty("生成模块名")
    private String moduleName;

    @ApiModelProperty("生成业务名")
    private String businessName;

    @ApiModelProperty("生成功能名")
    private String functionName;

    @ApiModelProperty("生成功能作者")
    private String functionAuthor;

    @ApiModelProperty("生成代码方式（0zip压缩包 1自定义路径）")
    private String genType;

    @ApiModelProperty("生成路径（不填默认项目路径）")
    private String genPath;

    @ApiModelProperty("其它生成选项")
    private String options;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("备注")
    private String remark;

}
