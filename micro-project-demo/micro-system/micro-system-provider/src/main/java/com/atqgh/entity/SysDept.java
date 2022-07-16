package com.atqgh.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * 部门表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Data
@TableName("sys_dept")
public class SysDept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门id.
     */
    @TableId
    private Long deptId;

    /**
     * 父部门id.
     */
    private Long parentId;

    /**
     * 祖级列表.
     */
    private String ancestors;

    /**
     * 部门名称.
     */
    private String deptName;

    /**
     * 显示顺序.
     */
    private Integer orderNum;

    /**
     * 负责人.
     */
    private String leader;

    /**
     * 联系电话.
     */
    private String phone;

    /**
     * 邮箱.
     */
    private String email;

    /**
     * 部门状态（0正常 1停用）.
     */
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）.
     */
    private String delFlag;

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

}
