package com.atqgh.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atqgh.entity.SysJobLog;
import com.atqgh.vo.SysJobLogQueryVo;
import org.springframework.beans.BeanUtils;

/**
 * 定时任务调度日志表.
 * 
 * @author Mubai
 * @date 2022-07-03 15:31:08
 */
@Mapper
public interface SysJobLogMapper extends BaseMapper<SysJobLog> {

    /**
    * 构建查询参数对象.
    *
    * @param queryVo 查询实体
    * @return 查询对象
    */
    default LambdaQueryWrapper<SysJobLog> buildQueryPageWrapper(SysJobLogQueryVo queryVo) {

        SysJobLog entity = new SysJobLog();
        BeanUtils.copyProperties(queryVo, entity);
        LambdaQueryWrapper<SysJobLog> wrapper = new QueryWrapper<SysJobLog>().lambda();
        // TODO 构建查询参数
        return wrapper;
    }

}
