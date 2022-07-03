package com.atqgh.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 参数配置表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@ApiModel
@Data
public class SysConfigAddVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("参数名称")
    private String configName;

    @ApiModelProperty("参数键名")
    private String configKey;

    @ApiModelProperty("参数键值")
    private String configValue;

    @ApiModelProperty("系统内置（Y是 N否）")
    private String configType;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("备注")
    private String remark;

}
