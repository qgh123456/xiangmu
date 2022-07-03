package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;

import org.springframework.stereotype.Service;

import com.atqgh.mapper.SysNoticeMapper;
import com.atqgh.entity.SysNotice;
import com.atqgh.service.SysNoticeService;
import com.atqgh.vo.SysNoticeQueryVo;
import com.atqgh.vo.SysNoticeAddVo;
import com.atqgh.vo.SysNoticeUptVo;
import com.atqgh.dto.SysNoticeDto;
import com.atqgh.dto.SysNoticePageDto;
import java.util.Set;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 通知公告表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:08
 */
@Slf4j
@Service("sysNoticeService")
public class SysNoticeServiceImpl extends ServiceImpl<SysNoticeMapper, SysNotice> implements SysNoticeService {

    @Resource
    private SysNoticeMapper sysNoticeMapper;

    @Override
    public int insert(SysNoticeAddVo addVo) {

        SysNotice addEntity = new SysNotice();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysNoticeUptVo updateVo) {

        SysNotice uptEntity = new SysNotice();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<Integer> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysNoticeDto getDetail(Integer id) {

        SysNotice entity = this.baseMapper.selectById(id);
        SysNoticeDto dto = new SysNoticeDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysNoticePageDto> queryPageByWrapper(SysNoticeQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysNotice> queryWrapper = this.sysNoticeMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysNotice> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysNoticePageDto.class));
//    }

}
