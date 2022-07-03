package com.atqgh.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atqgh.entity.GenTable;
import com.atqgh.vo.GenTableQueryVo;
import org.springframework.beans.BeanUtils;

/**
 * 代码生成业务表.
 * 
 * @author Mubai
 * @date 2022-07-03 15:31:08
 */
@Mapper
public interface GenTableMapper extends BaseMapper<GenTable> {

    /**
    * 构建查询参数对象.
    *
    * @param queryVo 查询实体
    * @return 查询对象
    */
    default LambdaQueryWrapper<GenTable> buildQueryPageWrapper(GenTableQueryVo queryVo) {

        GenTable entity = new GenTable();
        BeanUtils.copyProperties(queryVo, entity);
        LambdaQueryWrapper<GenTable> wrapper = new QueryWrapper<GenTable>().lambda();
        // TODO 构建查询参数
        return wrapper;
    }

}
