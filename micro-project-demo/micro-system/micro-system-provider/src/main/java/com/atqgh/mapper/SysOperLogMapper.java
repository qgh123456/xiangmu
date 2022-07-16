package com.atqgh.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atqgh.entity.SysOperLog;
import com.atqgh.vo.SysOperLogQueryVo;
import org.springframework.beans.BeanUtils;

/**
 * 操作日志记录.
 * 
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Mapper
public interface SysOperLogMapper extends BaseMapper<SysOperLog> {

    /**
    * 构建查询参数对象.
    *
    * @param queryVo 查询实体
    * @return 查询对象
    */
    default LambdaQueryWrapper<SysOperLog> buildQueryPageWrapper(SysOperLogQueryVo queryVo) {

        SysOperLog entity = new SysOperLog();
        BeanUtils.copyProperties(queryVo, entity);
        LambdaQueryWrapper<SysOperLog> wrapper = new QueryWrapper<SysOperLog>().lambda();
        // TODO 构建查询参数
        return wrapper;
    }

}
