package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysRoleMenuMapper;
import com.atqgh.entity.SysRoleMenu;
import com.atqgh.service.SysRoleMenuService;
import com.atqgh.vo.SysRoleMenuAddVo;
import com.atqgh.vo.SysRoleMenuUptVo;
import com.atqgh.dto.SysRoleMenuDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 角色和菜单关联表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Slf4j
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuService {

    @Resource
    private SysRoleMenuMapper sysRoleMenuMapper;

    @Override
    public int insert(@NonNull SysRoleMenuAddVo addVo) {

        SysRoleMenu addEntity = new SysRoleMenu();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysRoleMenuUptVo updateVo) {

        SysRoleMenu uptEntity = new SysRoleMenu();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysRoleMenuDto getDetail(@NonNull Long roleId) {

        SysRoleMenu entity = this.baseMapper.selectById(roleId);
        SysRoleMenuDto dto = new SysRoleMenuDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
