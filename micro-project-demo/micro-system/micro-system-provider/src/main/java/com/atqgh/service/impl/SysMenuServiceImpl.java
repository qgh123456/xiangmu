package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysMenuMapper;
import com.atqgh.entity.SysMenu;
import com.atqgh.service.SysMenuService;
import com.atqgh.vo.SysMenuQueryVo;
import com.atqgh.vo.SysMenuAddVo;
import com.atqgh.vo.SysMenuUptVo;
import com.atqgh.dto.SysMenuDto;
import com.atqgh.dto.SysMenuPageDto;
import java.util.Set;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 菜单权限表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Slf4j
@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    @Resource
    private SysMenuMapper sysMenuMapper;

    @Override
    public int insert(SysMenuAddVo addVo) {

        SysMenu addEntity = new SysMenu();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysMenuUptVo updateVo) {

        SysMenu uptEntity = new SysMenu();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysMenuDto getDetail(Long id) {

        SysMenu entity = this.baseMapper.selectById(id);
        SysMenuDto dto = new SysMenuDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysMenuPageDto> queryPageByWrapper(SysMenuQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysMenu> queryWrapper = this.sysMenuMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysMenu> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysMenuPageDto.class));
//    }

}
