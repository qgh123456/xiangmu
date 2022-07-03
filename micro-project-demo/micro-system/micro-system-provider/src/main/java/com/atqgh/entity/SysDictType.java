package com.atqgh.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * 字典类型表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Data
@TableName("sys_dict_type")
public class SysDictType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 字典主键.
     */
    private Long id;

    /**
     * 字典名称.
     */
    private String dictName;

    /**
     * 字典类型.
     */
    @TableId
    private String dictType;

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
