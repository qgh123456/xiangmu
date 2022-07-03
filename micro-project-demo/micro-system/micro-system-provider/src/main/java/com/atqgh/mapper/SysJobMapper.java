package com.atqgh.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atqgh.entity.SysJob;
import com.atqgh.vo.SysJobQueryVo;
import org.springframework.beans.BeanUtils;

/**
 * 定时任务调度表.
 * 
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Mapper
public interface SysJobMapper extends BaseMapper<SysJob> {

    /**
    * 构建查询参数对象.
    *
    * @param queryVo 查询实体
    * @return 查询对象
    */
    default LambdaQueryWrapper<SysJob> buildQueryPageWrapper(SysJobQueryVo queryVo) {

        SysJob entity = new SysJob();
        BeanUtils.copyProperties(queryVo, entity);
        LambdaQueryWrapper<SysJob> wrapper = new QueryWrapper<SysJob>().lambda();
        // TODO 构建查询参数
        return wrapper;
    }

}
