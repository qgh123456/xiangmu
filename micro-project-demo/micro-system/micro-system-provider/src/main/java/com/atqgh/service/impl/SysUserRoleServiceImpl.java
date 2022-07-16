package com.atqgh.service.impl;

import com.atqgh.dto.SysUserRoleDto;
import com.atqgh.entity.SysUserRole;
import com.atqgh.service.SysUserRoleService;
import com.atqgh.vo.SysUserRoleAddVo;
import com.atqgh.vo.SysUserRoleUptVo;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import org.springframework.stereotype.Service;

/**
 * 用户角色关联.
 * @author Mubai
 * @date 2022/7/16 9:06 上午
 **/
@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {
    @Override
    public int insert(SysUserRoleAddVo addVo) {
        return 0;
    }

    @Override
    public int update(SysUserRoleUptVo updateVo) {
        return 0;
    }

    @Override
    public void batchDel(Set<Long> pks) {

    }

    @Override
    public SysUserRoleDto getDetail(Long userId) {
        return null;
    }

    @Override
    public boolean saveBatch(Collection<SysUserRole> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<SysUserRole> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<SysUserRole> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(SysUserRole entity) {
        return false;
    }

    @Override
    public SysUserRole getOne(Wrapper<SysUserRole> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<SysUserRole> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<SysUserRole> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<SysUserRole> getBaseMapper() {
        return null;
    }
}
