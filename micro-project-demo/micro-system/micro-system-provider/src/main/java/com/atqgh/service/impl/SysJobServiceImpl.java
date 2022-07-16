package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysJobMapper;
import com.atqgh.entity.SysJob;
import com.atqgh.service.SysJobService;
import com.atqgh.vo.SysJobAddVo;
import com.atqgh.vo.SysJobUptVo;
import com.atqgh.dto.SysJobDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 定时任务调度表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
@Slf4j
@Service("sysJobService")
public class SysJobServiceImpl extends ServiceImpl<SysJobMapper, SysJob> implements SysJobService {

    @Resource
    private SysJobMapper sysJobMapper;

    @Override
    public int insert(@NonNull SysJobAddVo addVo) {

        SysJob addEntity = new SysJob();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysJobUptVo updateVo) {

        SysJob uptEntity = new SysJob();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysJobDto getDetail(@NonNull Long jobId) {

        SysJob entity = this.baseMapper.selectById(jobId);
        SysJobDto dto = new SysJobDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
