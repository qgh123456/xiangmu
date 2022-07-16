package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysConfigMapper;
import com.atqgh.entity.SysConfig;
import com.atqgh.service.SysConfigService;
import com.atqgh.vo.SysConfigAddVo;
import com.atqgh.vo.SysConfigUptVo;
import com.atqgh.dto.SysConfigDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 参数配置表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
@Slf4j
@Service("sysConfigService")
public class SysConfigServiceImpl extends ServiceImpl<SysConfigMapper, SysConfig> implements SysConfigService {

    @Resource
    private SysConfigMapper sysConfigMapper;

    @Override
    public int insert(@NonNull SysConfigAddVo addVo) {

        SysConfig addEntity = new SysConfig();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysConfigUptVo updateVo) {

        SysConfig uptEntity = new SysConfig();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Integer> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysConfigDto getDetail(@NonNull Integer configId) {

        SysConfig entity = this.baseMapper.selectById(configId);
        SysConfigDto dto = new SysConfigDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
