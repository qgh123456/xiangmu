package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;

import org.springframework.stereotype.Service;

import com.atqgh.mapper.SysRoleDeptMapper;
import com.atqgh.entity.SysRoleDept;
import com.atqgh.service.SysRoleDeptService;
import com.atqgh.vo.SysRoleDeptQueryVo;
import com.atqgh.vo.SysRoleDeptAddVo;
import com.atqgh.vo.SysRoleDeptUptVo;
import com.atqgh.dto.SysRoleDeptDto;
import com.atqgh.dto.SysRoleDeptPageDto;
import java.util.Set;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 角色和部门关联表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Slf4j
@Service("sysRoleDeptService")
public class SysRoleDeptServiceImpl extends ServiceImpl<SysRoleDeptMapper, SysRoleDept> implements SysRoleDeptService {

    @Resource
    private SysRoleDeptMapper sysRoleDeptMapper;

    @Override
    public int insert(SysRoleDeptAddVo addVo) {

        SysRoleDept addEntity = new SysRoleDept();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysRoleDeptUptVo updateVo) {

        SysRoleDept uptEntity = new SysRoleDept();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<String> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysRoleDeptDto getDetail(String roleCode) {

        SysRoleDept entity = this.baseMapper.selectById(roleCode);
        SysRoleDeptDto dto = new SysRoleDeptDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysRoleDeptPageDto> queryPageByWrapper(SysRoleDeptQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysRoleDept> queryWrapper = this.sysRoleDeptMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysRoleDept> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysRoleDeptPageDto.class));
//    }

}
