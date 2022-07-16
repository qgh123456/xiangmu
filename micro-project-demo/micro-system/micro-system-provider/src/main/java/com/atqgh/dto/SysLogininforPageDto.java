package com.atqgh.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 系统访问记录.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
@ApiModel
@Data
public class SysLogininforPageDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 访问ID.
     */
    @ApiModelProperty("访问ID")
    private Long infoId;

    /**
     * 用户账号.
     */
    @ApiModelProperty("用户账号")
    private String userName;

    /**
     * 登录IP地址.
     */
    @ApiModelProperty("登录IP地址")
    private String ipaddr;

    /**
     * 登录状态（0成功 1失败）.
     */
    @ApiModelProperty("登录状态（0成功 1失败）")
    private String status;

    /**
     * 提示信息.
     */
    @ApiModelProperty("提示信息")
    private String msg;

    /**
     * 访问时间.
     */
    @ApiModelProperty("访问时间")
    private Date accessTime;

}
