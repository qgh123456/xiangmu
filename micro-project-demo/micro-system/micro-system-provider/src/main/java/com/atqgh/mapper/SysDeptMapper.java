package com.atqgh.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atqgh.entity.SysDept;
import com.atqgh.vo.SysDeptQueryVo;
import org.springframework.beans.BeanUtils;

/**
 * 部门表.
 * 
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Mapper
public interface SysDeptMapper extends BaseMapper<SysDept> {

    /**
    * 构建查询参数对象.
    *
    * @param queryVo 查询实体
    * @return 查询对象
    */
    default LambdaQueryWrapper<SysDept> buildQueryPageWrapper(SysDeptQueryVo queryVo) {

        SysDept entity = new SysDept();
        BeanUtils.copyProperties(queryVo, entity);
        LambdaQueryWrapper<SysDept> wrapper = new QueryWrapper<SysDept>().lambda();
        // TODO 构建查询参数
        return wrapper;
    }

}
