package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysOperLogMapper;
import com.atqgh.entity.SysOperLog;
import com.atqgh.service.SysOperLogService;
import com.atqgh.vo.SysOperLogQueryVo;
import com.atqgh.vo.SysOperLogAddVo;
import com.atqgh.vo.SysOperLogUptVo;
import com.atqgh.dto.SysOperLogDto;
import com.atqgh.dto.SysOperLogPageDto;
import java.util.Set;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 操作日志记录 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Slf4j
@Service("sysOperLogService")
public class SysOperLogServiceImpl extends ServiceImpl<SysOperLogMapper, SysOperLog> implements SysOperLogService {

    @Resource
    private SysOperLogMapper sysOperLogMapper;

    @Override
    public int insert(SysOperLogAddVo addVo) {

        SysOperLog addEntity = new SysOperLog();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysOperLogUptVo updateVo) {

        SysOperLog uptEntity = new SysOperLog();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysOperLogDto getDetail(Long id) {

        SysOperLog entity = this.baseMapper.selectById(id);
        SysOperLogDto dto = new SysOperLogDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysOperLogPageDto> queryPageByWrapper(SysOperLogQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysOperLog> queryWrapper = this.sysOperLogMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysOperLog> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysOperLogPageDto.class));
//    }

}
