package com.atqgh.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 通知公告表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@ApiModel
@Data
public class SysNoticeQueryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公告ID.
     */
    @ApiModelProperty("公告ID")
    private Integer noticeId;

    /**
     * 公告标题.
     */
    @ApiModelProperty("公告标题")
    private String noticeTitle;

    /**
     * 公告类型（1通知 2公告）.
     */
    @ApiModelProperty("公告类型（1通知 2公告）")
    private String noticeType;

    /**
     * 公告内容.
     */
    @ApiModelProperty("公告内容")
    private String noticeContent;

    /**
     * 公告状态（0正常 1关闭）.
     */
    @ApiModelProperty("公告状态（0正常 1关闭）")
    private String status;

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
