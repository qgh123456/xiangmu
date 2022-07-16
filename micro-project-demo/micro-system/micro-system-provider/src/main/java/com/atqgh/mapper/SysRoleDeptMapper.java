package com.atqgh.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atqgh.entity.SysRoleDept;
import com.atqgh.vo.SysRoleDeptQueryVo;
import org.springframework.beans.BeanUtils;

/**
 * 角色和部门关联表.
 * 
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Mapper
public interface SysRoleDeptMapper extends BaseMapper<SysRoleDept> {

    /**
    * 构建查询参数对象.
    *
    * @param queryVo 查询实体
    * @return 查询对象
    */
    default LambdaQueryWrapper<SysRoleDept> buildQueryPageWrapper(SysRoleDeptQueryVo queryVo) {

        SysRoleDept entity = new SysRoleDept();
        BeanUtils.copyProperties(queryVo, entity);
        LambdaQueryWrapper<SysRoleDept> wrapper = new QueryWrapper<SysRoleDept>().lambda();
        // TODO 构建查询参数
        return wrapper;
    }

}
