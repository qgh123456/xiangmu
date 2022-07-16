package com.atqgh.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;
import javax.validation.constraints.NotNull;

/**
 * 通知公告表.
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@ApiModel
@Data
public class SysNoticeUptVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("公告ID")
    @NotNull
    private Integer noticeId;

    @ApiModelProperty("公告标题")
    @NotNull
    private String noticeTitle;

    @ApiModelProperty("公告类型（1通知 2公告）")
    @NotNull
    private String noticeType;

    @ApiModelProperty("公告内容")
    private String noticeContent;

    @ApiModelProperty("公告状态（0正常 1关闭）")
    private String status;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("备注")
    private String remark;

}
