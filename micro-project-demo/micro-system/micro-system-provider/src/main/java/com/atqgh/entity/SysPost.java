package com.atqgh.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * 岗位信息表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:10
 */
@Data
@TableName("sys_post")
public class SysPost implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 岗位ID.
     */
    @TableId
    private Long postId;

    /**
     * 岗位编码.
     */
    private String postCode;

    /**
     * 岗位名称.
     */
    private String postName;

    /**
     * 显示顺序.
     */
    private Integer postSort;

    /**
     * 状态（0正常 1停用）.
     */
    private String status;

    /**
     * 创建者.
     */
    private String createBy;

    /**
     * 创建时间.
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新者.
     */
    private String updateBy;

    /**
     * 更新时间.
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 备注.
     */
    private String remark;

}
