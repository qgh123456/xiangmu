package com.atqgh.service.impl;

import com.atqgh.common.utils.TransformResult;
import com.atqgh.system.dto.SysUserDto;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysUserMapper;
import com.atqgh.entity.SysUser;
import com.atqgh.service.SysUserService;
import com.atqgh.vo.SysUserAddVo;
import com.atqgh.vo.SysUserUptVo;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 用户信息表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:10
 */
@Slf4j
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public int insert(SysUserAddVo addVo) {

        SysUser addEntity = new SysUser();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysUserUptVo updateVo) {

        SysUser uptEntity = new SysUser();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysUserDto getDetail(Long userId) {

        SysUser entity = this.baseMapper.selectById(userId);
        SysUserDto dto = new SysUserDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public SysUserDto findByUsername(String username) {

        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<SysUser>();
        queryWrapper.eq(ObjectUtils.isNotEmpty(username), SysUser::getUserName, username);
        SysUser sysUser = this.sysUserMapper.selectOne(queryWrapper);
        return TransformResult.entityToDto(sysUser, SysUserDto.class);
    }

//    @Override
//    public PageInfo<SysUserPageDto> queryPageByWrapper(SysUserQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysUser> queryWrapper = this.sysUserMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysUser> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysUserPageDto.class));
//    }

}
