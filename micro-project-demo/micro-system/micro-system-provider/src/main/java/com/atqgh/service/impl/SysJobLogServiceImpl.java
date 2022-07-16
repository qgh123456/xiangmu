package com.atqgh.service.impl;

import javax.annotation.Resource;
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
import org.springframework.lang.NonNull;

/**
 * 定时任务调度日志表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
@Slf4j
@Service("sysJobLogService")
public class SysJobLogServiceImpl extends ServiceImpl<SysJobLogMapper, SysJobLog> implements SysJobLogService {

    @Resource
    private SysJobLogMapper sysJobLogMapper;

    @Override
    public int insert(@NonNull SysJobLogAddVo addVo) {

        SysJobLog addEntity = new SysJobLog();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysJobLogUptVo updateVo) {

        SysJobLog uptEntity = new SysJobLog();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysJobLogDto getDetail(@NonNull Long jobLogId) {

        SysJobLog entity = this.baseMapper.selectById(jobLogId);
        SysJobLogDto dto = new SysJobLogDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
