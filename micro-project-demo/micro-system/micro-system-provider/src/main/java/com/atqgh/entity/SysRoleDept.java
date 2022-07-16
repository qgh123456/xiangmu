package com.atqgh.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 角色和部门关联表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Data
@TableName("sys_role_dept")
public class SysRoleDept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID.
     */
    @TableId
    private Long roleId;

    /**
     * 部门ID.
     */
    private Long deptId;

}
