package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysRoleMapper;
import com.atqgh.entity.SysRole;
import com.atqgh.service.SysRoleService;
import com.atqgh.vo.SysRoleAddVo;
import com.atqgh.vo.SysRoleUptVo;
import com.atqgh.dto.SysRoleDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 角色信息表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Slf4j
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public int insert(@NonNull SysRoleAddVo addVo) {

        SysRole addEntity = new SysRole();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysRoleUptVo updateVo) {

        SysRole uptEntity = new SysRole();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysRoleDto getDetail(@NonNull Long roleId) {

        SysRole entity = this.baseMapper.selectById(roleId);
        SysRoleDto dto = new SysRoleDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
