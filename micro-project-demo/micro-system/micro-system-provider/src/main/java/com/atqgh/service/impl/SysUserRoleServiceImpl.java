package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;

import org.springframework.stereotype.Service;

import com.atqgh.mapper.SysUserRoleMapper;
import com.atqgh.entity.SysUserRole;
import com.atqgh.service.SysUserRoleService;
import com.atqgh.vo.SysUserRoleQueryVo;
import com.atqgh.vo.SysUserRoleAddVo;
import com.atqgh.vo.SysUserRoleUptVo;
import com.atqgh.dto.SysUserRoleDto;
import com.atqgh.dto.SysUserRolePageDto;
import java.util.Set;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 用户和角色关联表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Slf4j
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

    @Resource
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public int insert(SysUserRoleAddVo addVo) {

        SysUserRole addEntity = new SysUserRole();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysUserRoleUptVo updateVo) {

        SysUserRole uptEntity = new SysUserRole();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<String> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysUserRoleDto getDetail(String userCode) {

        SysUserRole entity = this.baseMapper.selectById(userCode);
        SysUserRoleDto dto = new SysUserRoleDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysUserRolePageDto> queryPageByWrapper(SysUserRoleQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysUserRole> queryWrapper = this.sysUserRoleMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysUserRole> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysUserRolePageDto.class));
//    }

}
