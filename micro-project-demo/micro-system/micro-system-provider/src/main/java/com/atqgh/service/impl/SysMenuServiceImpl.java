package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysMenuMapper;
import com.atqgh.entity.SysMenu;
import com.atqgh.service.SysMenuService;
import com.atqgh.vo.SysMenuAddVo;
import com.atqgh.vo.SysMenuUptVo;
import com.atqgh.dto.SysMenuDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 菜单权限表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Slf4j
@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    @Resource
    private SysMenuMapper sysMenuMapper;

    @Override
    public int insert(@NonNull SysMenuAddVo addVo) {

        SysMenu addEntity = new SysMenu();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysMenuUptVo updateVo) {

        SysMenu uptEntity = new SysMenu();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysMenuDto getDetail(@NonNull Long menuId) {

        SysMenu entity = this.baseMapper.selectById(menuId);
        SysMenuDto dto = new SysMenuDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
}
