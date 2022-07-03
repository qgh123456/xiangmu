package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;

import org.springframework.stereotype.Service;

import com.atqgh.mapper.SysRoleMenuMapper;
import com.atqgh.entity.SysRoleMenu;
import com.atqgh.service.SysRoleMenuService;
import com.atqgh.vo.SysRoleMenuQueryVo;
import com.atqgh.vo.SysRoleMenuAddVo;
import com.atqgh.vo.SysRoleMenuUptVo;
import com.atqgh.dto.SysRoleMenuDto;
import com.atqgh.dto.SysRoleMenuPageDto;
import java.util.Set;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 角色和菜单关联表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Slf4j
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuService {

    @Resource
    private SysRoleMenuMapper sysRoleMenuMapper;

    @Override
    public int insert(SysRoleMenuAddVo addVo) {

        SysRoleMenu addEntity = new SysRoleMenu();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysRoleMenuUptVo updateVo) {

        SysRoleMenu uptEntity = new SysRoleMenu();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<String> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysRoleMenuDto getDetail(String roleCode) {

        SysRoleMenu entity = this.baseMapper.selectById(roleCode);
        SysRoleMenuDto dto = new SysRoleMenuDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysRoleMenuPageDto> queryPageByWrapper(SysRoleMenuQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysRoleMenu> queryWrapper = this.sysRoleMenuMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysRoleMenu> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysRoleMenuPageDto.class));
//    }

}
