package com.atqgh.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 系统访问记录.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@ApiModel
@Data
public class SysLogininforAddVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户账号")
    private String userName;

    @ApiModelProperty("登录IP地址")
    private String ipaddr;

    @ApiModelProperty("登录状态（0成功 1失败）")
    private String status;

    @ApiModelProperty("提示信息")
    private String msg;

    @ApiModelProperty("访问时间")
    private Date accessTime;

}
