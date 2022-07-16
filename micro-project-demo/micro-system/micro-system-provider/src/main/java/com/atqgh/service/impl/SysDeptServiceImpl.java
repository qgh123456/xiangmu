package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysDeptMapper;
import com.atqgh.entity.SysDept;
import com.atqgh.service.SysDeptService;
import com.atqgh.vo.SysDeptAddVo;
import com.atqgh.vo.SysDeptUptVo;
import com.atqgh.dto.SysDeptDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 部门表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Slf4j
@Service("sysDeptService")
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements SysDeptService {

    @Resource
    private SysDeptMapper sysDeptMapper;

    @Override
    public int insert(@NonNull SysDeptAddVo addVo) {

        SysDept addEntity = new SysDept();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysDeptUptVo updateVo) {

        SysDept uptEntity = new SysDept();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysDeptDto getDetail(@NonNull Long deptId) {

        SysDept entity = this.baseMapper.selectById(deptId);
        SysDeptDto dto = new SysDeptDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
