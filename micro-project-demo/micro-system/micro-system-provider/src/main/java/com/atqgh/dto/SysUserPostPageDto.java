package com.atqgh.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户与岗位关联表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@ApiModel
@Data
public class SysUserPostPageDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID.
     */
    @ApiModelProperty("用户ID")
    private Long userId;

    /**
     * 岗位ID.
     */
    @ApiModelProperty("岗位ID")
    private Long postId;

}
