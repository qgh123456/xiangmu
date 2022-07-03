package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;

import org.springframework.stereotype.Service;

import com.atqgh.mapper.SysPostMapper;
import com.atqgh.entity.SysPost;
import com.atqgh.service.SysPostService;
import com.atqgh.vo.SysPostQueryVo;
import com.atqgh.vo.SysPostAddVo;
import com.atqgh.vo.SysPostUptVo;
import com.atqgh.dto.SysPostDto;
import com.atqgh.dto.SysPostPageDto;
import java.util.Set;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 岗位信息表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:10
 */
@Slf4j
@Service("sysPostService")
public class SysPostServiceImpl extends ServiceImpl<SysPostMapper, SysPost> implements SysPostService {

    @Resource
    private SysPostMapper sysPostMapper;

    @Override
    public int insert(SysPostAddVo addVo) {

        SysPost addEntity = new SysPost();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysPostUptVo updateVo) {

        SysPost uptEntity = new SysPost();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysPostDto getDetail(Long postId) {

        SysPost entity = this.baseMapper.selectById(postId);
        SysPostDto dto = new SysPostDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysPostPageDto> queryPageByWrapper(SysPostQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysPost> queryWrapper = this.sysPostMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysPost> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysPostPageDto.class));
//    }

}
