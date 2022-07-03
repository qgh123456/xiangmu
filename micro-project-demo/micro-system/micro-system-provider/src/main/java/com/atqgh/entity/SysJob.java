package com.atqgh.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * 定时任务调度表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Data
@TableName("sys_job")
public class SysJob implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务ID.
     */
    @TableId
    private Long id;

    /**
     * 任务名称.
     */
    private String jobName;

    /**
     * 任务组名.
     */
    private String jobGroup;

    /**
     * 调用目标字符串.
     */
    private String invokeTarget;

    /**
     * cron执行表达式.
     */
    private String cronExpression;

    /**
     * 计划执行错误策略（1立即执行 2执行一次 3放弃执行）.
     */
    private String misfirePolicy;

    /**
     * 是否并发执行（0允许 1禁止）.
     */
    private String concurrent;

    /**
     * 状态（0正常 1暂停）.
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
     * 备注信息.
     */
    private String remark;

}
