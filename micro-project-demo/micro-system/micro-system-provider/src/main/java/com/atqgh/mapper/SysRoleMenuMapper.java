package com.atqgh.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atqgh.entity.SysRoleMenu;
import com.atqgh.vo.SysRoleMenuQueryVo;
import org.springframework.beans.BeanUtils;

/**
 * 角色和菜单关联表.
 * 
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Mapper
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

    /**
    * 构建查询参数对象.
    *
    * @param queryVo 查询实体
    * @return 查询对象
    */
    default LambdaQueryWrapper<SysRoleMenu> buildQueryPageWrapper(SysRoleMenuQueryVo queryVo) {

        SysRoleMenu entity = new SysRoleMenu();
        BeanUtils.copyProperties(queryVo, entity);
        LambdaQueryWrapper<SysRoleMenu> wrapper = new QueryWrapper<SysRoleMenu>().lambda();
        // TODO 构建查询参数
        return wrapper;
    }

}
