package com.atqgh.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atqgh.entity.GenTableColumn;
import com.atqgh.vo.GenTableColumnQueryVo;
import org.springframework.beans.BeanUtils;

/**
 * 代码生成业务表字段.
 * 
 * @author Mubai
 * @date 2022-07-03 15:31:08
 */
@Mapper
public interface GenTableColumnMapper extends BaseMapper<GenTableColumn> {

    /**
    * 构建查询参数对象.
    *
    * @param queryVo 查询实体
    * @return 查询对象
    */
    default LambdaQueryWrapper<GenTableColumn> buildQueryPageWrapper(GenTableColumnQueryVo queryVo) {

        GenTableColumn entity = new GenTableColumn();
        BeanUtils.copyProperties(queryVo, entity);
        LambdaQueryWrapper<GenTableColumn> wrapper = new QueryWrapper<GenTableColumn>().lambda();
        // TODO 构建查询参数
        return wrapper;
    }

}
