package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysRoleDeptMapper;
import com.atqgh.entity.SysRoleDept;
import com.atqgh.service.SysRoleDeptService;
import com.atqgh.vo.SysRoleDeptAddVo;
import com.atqgh.vo.SysRoleDeptUptVo;
import com.atqgh.dto.SysRoleDeptDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 角色和部门关联表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Slf4j
@Service("sysRoleDeptService")
public class SysRoleDeptServiceImpl extends ServiceImpl<SysRoleDeptMapper, SysRoleDept> implements SysRoleDeptService {

    @Resource
    private SysRoleDeptMapper sysRoleDeptMapper;

    @Override
    public int insert(@NonNull SysRoleDeptAddVo addVo) {

        SysRoleDept addEntity = new SysRoleDept();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysRoleDeptUptVo updateVo) {

        SysRoleDept uptEntity = new SysRoleDept();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysRoleDeptDto getDetail(@NonNull Long roleId) {

        SysRoleDept entity = this.baseMapper.selectById(roleId);
        SysRoleDeptDto dto = new SysRoleDeptDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
