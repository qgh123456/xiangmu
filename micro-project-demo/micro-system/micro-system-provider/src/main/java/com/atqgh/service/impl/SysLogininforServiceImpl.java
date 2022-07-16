package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysLogininforMapper;
import com.atqgh.entity.SysLogininfor;
import com.atqgh.service.SysLogininforService;
import com.atqgh.vo.SysLogininforAddVo;
import com.atqgh.vo.SysLogininforUptVo;
import com.atqgh.dto.SysLogininforDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 系统访问记录 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
@Slf4j
@Service("sysLogininforService")
public class SysLogininforServiceImpl extends ServiceImpl<SysLogininforMapper, SysLogininfor> implements SysLogininforService {

    @Resource
    private SysLogininforMapper sysLogininforMapper;

    @Override
    public int insert(@NonNull SysLogininforAddVo addVo) {

        SysLogininfor addEntity = new SysLogininfor();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysLogininforUptVo updateVo) {

        SysLogininfor uptEntity = new SysLogininfor();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysLogininforDto getDetail(@NonNull Long infoId) {

        SysLogininfor entity = this.baseMapper.selectById(infoId);
        SysLogininforDto dto = new SysLogininforDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
