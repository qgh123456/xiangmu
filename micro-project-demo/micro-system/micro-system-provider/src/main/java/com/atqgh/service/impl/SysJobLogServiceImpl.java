package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysJobLogMapper;
import com.atqgh.entity.SysJobLog;
import com.atqgh.service.SysJobLogService;
import com.atqgh.vo.SysJobLogQueryVo;
import com.atqgh.vo.SysJobLogAddVo;
import com.atqgh.vo.SysJobLogUptVo;
import com.atqgh.dto.SysJobLogDto;
import com.atqgh.dto.SysJobLogPageDto;
import java.util.Set;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 定时任务调度日志表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:08
 */
@Slf4j
@Service("sysJobLogService")
public class SysJobLogServiceImpl extends ServiceImpl<SysJobLogMapper, SysJobLog> implements SysJobLogService {

    @Resource
    private SysJobLogMapper sysJobLogMapper;

    @Override
    public int insert(SysJobLogAddVo addVo) {

        SysJobLog addEntity = new SysJobLog();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysJobLogUptVo updateVo) {

        SysJobLog uptEntity = new SysJobLog();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysJobLogDto getDetail(Long id) {

        SysJobLog entity = this.baseMapper.selectById(id);
        SysJobLogDto dto = new SysJobLogDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysJobLogPageDto> queryPageByWrapper(SysJobLogQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysJobLog> queryWrapper = this.sysJobLogMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysJobLog> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysJobLogPageDto.class));
//    }

}
