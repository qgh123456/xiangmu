package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysConfigMapper;
import com.atqgh.entity.SysConfig;
import com.atqgh.service.SysConfigService;
import com.atqgh.vo.SysConfigQueryVo;
import com.atqgh.vo.SysConfigAddVo;
import com.atqgh.vo.SysConfigUptVo;
import com.atqgh.dto.SysConfigDto;
import com.atqgh.dto.SysConfigPageDto;
import java.util.Set;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 参数配置表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Slf4j
@Service("sysConfigService")
public class SysConfigServiceImpl extends ServiceImpl<SysConfigMapper, SysConfig> implements SysConfigService {

    @Resource
    private SysConfigMapper sysConfigMapper;

    @Override
    public int insert(SysConfigAddVo addVo) {

        SysConfig addEntity = new SysConfig();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysConfigUptVo updateVo) {

        SysConfig uptEntity = new SysConfig();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<Integer> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysConfigDto getDetail(Integer id) {

        SysConfig entity = this.baseMapper.selectById(id);
        SysConfigDto dto = new SysConfigDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysConfigPageDto> queryPageByWrapper(SysConfigQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysConfig> queryWrapper = this.sysConfigMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysConfig> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysConfigPageDto.class));
//    }

}
