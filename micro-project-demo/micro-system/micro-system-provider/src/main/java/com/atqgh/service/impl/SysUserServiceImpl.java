package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysUserMapper;
import com.atqgh.entity.SysUser;
import com.atqgh.service.SysUserService;
import com.atqgh.vo.SysUserAddVo;
import com.atqgh.vo.SysUserUptVo;
import com.atqgh.dto.SysUserDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 用户信息表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Slf4j
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public int insert(@NonNull SysUserAddVo addVo) {

        SysUser addEntity = new SysUser();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysUserUptVo updateVo) {

        SysUser uptEntity = new SysUser();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysUserDto getDetail(@NonNull Long userId) {

        SysUser entity = this.baseMapper.selectById(userId);
        SysUserDto dto = new SysUserDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
