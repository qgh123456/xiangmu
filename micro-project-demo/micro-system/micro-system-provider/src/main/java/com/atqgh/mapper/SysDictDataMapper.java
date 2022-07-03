package com.atqgh.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atqgh.entity.SysDictData;
import com.atqgh.vo.SysDictDataQueryVo;
import org.springframework.beans.BeanUtils;

/**
 * 字典数据表.
 * 
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Mapper
public interface SysDictDataMapper extends BaseMapper<SysDictData> {

    /**
    * 构建查询参数对象.
    *
    * @param queryVo 查询实体
    * @return 查询对象
    */
    default LambdaQueryWrapper<SysDictData> buildQueryPageWrapper(SysDictDataQueryVo queryVo) {

        SysDictData entity = new SysDictData();
        BeanUtils.copyProperties(queryVo, entity);
        LambdaQueryWrapper<SysDictData> wrapper = new QueryWrapper<SysDictData>().lambda();
        // TODO 构建查询参数
        return wrapper;
    }

}
