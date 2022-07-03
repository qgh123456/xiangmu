package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;

import org.springframework.stereotype.Service;

import com.atqgh.mapper.SysRoleMapper;
import com.atqgh.entity.SysRole;
import com.atqgh.service.SysRoleService;
import com.atqgh.vo.SysRoleQueryVo;
import com.atqgh.vo.SysRoleAddVo;
import com.atqgh.vo.SysRoleUptVo;
import com.atqgh.dto.SysRoleDto;
import com.atqgh.dto.SysRolePageDto;
import java.util.Set;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 角色信息表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Slf4j
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public int insert(SysRoleAddVo addVo) {

        SysRole addEntity = new SysRole();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysRoleUptVo updateVo) {

        SysRole uptEntity = new SysRole();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysRoleDto getDetail(Long roleId) {

        SysRole entity = this.baseMapper.selectById(roleId);
        SysRoleDto dto = new SysRoleDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysRolePageDto> queryPageByWrapper(SysRoleQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysRole> queryWrapper = this.sysRoleMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysRole> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysRolePageDto.class));
//    }

}
