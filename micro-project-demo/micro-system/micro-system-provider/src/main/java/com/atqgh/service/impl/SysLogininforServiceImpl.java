package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysLogininforMapper;
import com.atqgh.entity.SysLogininfor;
import com.atqgh.service.SysLogininforService;
import com.atqgh.vo.SysLogininforQueryVo;
import com.atqgh.vo.SysLogininforAddVo;
import com.atqgh.vo.SysLogininforUptVo;
import com.atqgh.dto.SysLogininforDto;
import com.atqgh.dto.SysLogininforPageDto;
import java.util.Set;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 系统访问记录 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Slf4j
@Service("sysLogininforService")
public class SysLogininforServiceImpl extends ServiceImpl<SysLogininforMapper, SysLogininfor> implements SysLogininforService {

    @Resource
    private SysLogininforMapper sysLogininforMapper;

    @Override
    public int insert(SysLogininforAddVo addVo) {

        SysLogininfor addEntity = new SysLogininfor();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysLogininforUptVo updateVo) {

        SysLogininfor uptEntity = new SysLogininfor();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysLogininforDto getDetail(Long id) {

        SysLogininfor entity = this.baseMapper.selectById(id);
        SysLogininforDto dto = new SysLogininforDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysLogininforPageDto> queryPageByWrapper(SysLogininforQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysLogininfor> queryWrapper = this.sysLogininforMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysLogininfor> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysLogininforPageDto.class));
//    }

}
