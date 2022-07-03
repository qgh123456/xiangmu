package com.atqgh.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atqgh.entity.SysRole;
import com.atqgh.vo.SysRoleQueryVo;
import org.springframework.beans.BeanUtils;

/**
 * 角色信息表.
 * 
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {

    /**
    * 构建查询参数对象.
    *
    * @param queryVo 查询实体
    * @return 查询对象
    */
    default LambdaQueryWrapper<SysRole> buildQueryPageWrapper(SysRoleQueryVo queryVo) {

        SysRole entity = new SysRole();
        BeanUtils.copyProperties(queryVo, entity);
        LambdaQueryWrapper<SysRole> wrapper = new QueryWrapper<SysRole>().lambda();
        // TODO 构建查询参数
        return wrapper;
    }

}
