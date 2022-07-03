package com.atqgh.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;
import javax.validation.constraints.NotNull;

/**
 * 代码生成业务表字段.
 * @author Mubai
 * @date 2022-07-03 15:31:08
 */
@ApiModel
@Data
public class GenTableColumnUptVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("编号")
    @NotNull
    private Long id;

    @ApiModelProperty("归属表编号")
    private String tableId;

    @ApiModelProperty("列名称")
    private String columnName;

    @ApiModelProperty("列描述")
    private String columnComment;

    @ApiModelProperty("列类型")
    private String columnType;

    @ApiModelProperty("JAVA类型")
    private String javaType;

    @ApiModelProperty("JAVA字段名")
    private String javaField;

    @ApiModelProperty("是否主键（1是）")
    private String isPk;

    @ApiModelProperty("是否自增（1是）")
    private String isIncrement;

    @ApiModelProperty("是否必填（1是）")
    private String isRequired;

    @ApiModelProperty("是否为插入字段（1是）")
    private String isInsert;

    @ApiModelProperty("是否编辑字段（1是）")
    private String isEdit;

    @ApiModelProperty("是否列表字段（1是）")
    private String isList;

    @ApiModelProperty("是否查询字段（1是）")
    private String isQuery;

    @ApiModelProperty("查询方式（等于、不等于、大于、小于、范围）")
    private String queryType;

    @ApiModelProperty("显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）")
    private String htmlType;

    @ApiModelProperty("字典类型")
    private String dictType;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

}
