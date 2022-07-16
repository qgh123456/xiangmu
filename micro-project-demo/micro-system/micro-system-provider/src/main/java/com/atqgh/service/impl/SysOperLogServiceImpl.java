package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysOperLogMapper;
import com.atqgh.entity.SysOperLog;
import com.atqgh.service.SysOperLogService;
import com.atqgh.vo.SysOperLogAddVo;
import com.atqgh.vo.SysOperLogUptVo;
import com.atqgh.dto.SysOperLogDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 操作日志记录 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Slf4j
@Service("sysOperLogService")
public class SysOperLogServiceImpl extends ServiceImpl<SysOperLogMapper, SysOperLog> implements SysOperLogService {

    @Resource
    private SysOperLogMapper sysOperLogMapper;

    @Override
    public int insert(@NonNull SysOperLogAddVo addVo) {

        SysOperLog addEntity = new SysOperLog();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysOperLogUptVo updateVo) {

        SysOperLog uptEntity = new SysOperLog();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysOperLogDto getDetail(@NonNull Long operId) {

        SysOperLog entity = this.baseMapper.selectById(operId);
        SysOperLogDto dto = new SysOperLogDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
