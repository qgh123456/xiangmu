package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysPostMapper;
import com.atqgh.entity.SysPost;
import com.atqgh.service.SysPostService;
import com.atqgh.vo.SysPostAddVo;
import com.atqgh.vo.SysPostUptVo;
import com.atqgh.dto.SysPostDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 岗位信息表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Slf4j
@Service("sysPostService")
public class SysPostServiceImpl extends ServiceImpl<SysPostMapper, SysPost> implements SysPostService {

    @Resource
    private SysPostMapper sysPostMapper;

    @Override
    public int insert(@NonNull SysPostAddVo addVo) {

        SysPost addEntity = new SysPost();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysPostUptVo updateVo) {

        SysPost uptEntity = new SysPost();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysPostDto getDetail(@NonNull Long postId) {

        SysPost entity = this.baseMapper.selectById(postId);
        SysPostDto dto = new SysPostDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
