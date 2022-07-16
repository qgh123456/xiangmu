package com.atqgh.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atqgh.entity.SysLogininfor;
import com.atqgh.vo.SysLogininforQueryVo;
import org.springframework.beans.BeanUtils;

/**
 * 系统访问记录.
 * 
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
@Mapper
public interface SysLogininforMapper extends BaseMapper<SysLogininfor> {

    /**
    * 构建查询参数对象.
    *
    * @param queryVo 查询实体
    * @return 查询对象
    */
    default LambdaQueryWrapper<SysLogininfor> buildQueryPageWrapper(SysLogininforQueryVo queryVo) {

        SysLogininfor entity = new SysLogininfor();
        BeanUtils.copyProperties(queryVo, entity);
        LambdaQueryWrapper<SysLogininfor> wrapper = new QueryWrapper<SysLogininfor>().lambda();
        // TODO 构建查询参数
        return wrapper;
    }

}
