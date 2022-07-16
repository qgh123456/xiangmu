package com.atqgh.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atqgh.entity.SysNotice;
import com.atqgh.vo.SysNoticeQueryVo;
import org.springframework.beans.BeanUtils;

/**
 * 通知公告表.
 * 
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Mapper
public interface SysNoticeMapper extends BaseMapper<SysNotice> {

    /**
    * 构建查询参数对象.
    *
    * @param queryVo 查询实体
    * @return 查询对象
    */
    default LambdaQueryWrapper<SysNotice> buildQueryPageWrapper(SysNoticeQueryVo queryVo) {

        SysNotice entity = new SysNotice();
        BeanUtils.copyProperties(queryVo, entity);
        LambdaQueryWrapper<SysNotice> wrapper = new QueryWrapper<SysNotice>().lambda();
        // TODO 构建查询参数
        return wrapper;
    }

}
