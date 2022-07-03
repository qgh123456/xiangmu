package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;

import org.springframework.stereotype.Service;

import com.atqgh.mapper.SysUserPostMapper;
import com.atqgh.entity.SysUserPost;
import com.atqgh.service.SysUserPostService;
import com.atqgh.vo.SysUserPostQueryVo;
import com.atqgh.vo.SysUserPostAddVo;
import com.atqgh.vo.SysUserPostUptVo;
import com.atqgh.dto.SysUserPostDto;
import com.atqgh.dto.SysUserPostPageDto;
import java.util.Set;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 用户与岗位关联表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Slf4j
@Service("sysUserPostService")
public class SysUserPostServiceImpl extends ServiceImpl<SysUserPostMapper, SysUserPost> implements SysUserPostService {

    @Resource
    private SysUserPostMapper sysUserPostMapper;

    @Override
    public int insert(SysUserPostAddVo addVo) {

        SysUserPost addEntity = new SysUserPost();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysUserPostUptVo updateVo) {

        SysUserPost uptEntity = new SysUserPost();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<String> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysUserPostDto getDetail(String userCode) {

        SysUserPost entity = this.baseMapper.selectById(userCode);
        SysUserPostDto dto = new SysUserPostDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysUserPostPageDto> queryPageByWrapper(SysUserPostQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysUserPost> queryWrapper = this.sysUserPostMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysUserPost> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysUserPostPageDto.class));
//    }

}
