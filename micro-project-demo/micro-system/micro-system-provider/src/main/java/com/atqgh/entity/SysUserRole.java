package com.atqgh.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户和角色关联表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Data
@TableName("sys_user_role")
public class SysUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID.
     */
    @TableId
    private Long userId;

    /**
     * 角色ID.
     */
    private Long roleId;

}
