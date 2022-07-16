package com.atqgh.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户与岗位关联表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Data
@TableName("sys_user_post")
public class SysUserPost implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID.
     */
    @TableId
    private Long userId;

    /**
     * 岗位ID.
     */
    private Long postId;

}
