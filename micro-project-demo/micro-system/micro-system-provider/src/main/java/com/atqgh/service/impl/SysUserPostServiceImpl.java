package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysUserPostMapper;
import com.atqgh.entity.SysUserPost;
import com.atqgh.service.SysUserPostService;
import com.atqgh.vo.SysUserPostAddVo;
import com.atqgh.vo.SysUserPostUptVo;
import com.atqgh.dto.SysUserPostDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 用户与岗位关联表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Slf4j
@Service("sysUserPostService")
public class SysUserPostServiceImpl extends ServiceImpl<SysUserPostMapper, SysUserPost> implements SysUserPostService {

    @Resource
    private SysUserPostMapper sysUserPostMapper;

    @Override
    public int insert(@NonNull SysUserPostAddVo addVo) {

        SysUserPost addEntity = new SysUserPost();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysUserPostUptVo updateVo) {

        SysUserPost uptEntity = new SysUserPost();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysUserPostDto getDetail(@NonNull Long userId) {

        SysUserPost entity = this.baseMapper.selectById(userId);
        SysUserPostDto dto = new SysUserPostDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
