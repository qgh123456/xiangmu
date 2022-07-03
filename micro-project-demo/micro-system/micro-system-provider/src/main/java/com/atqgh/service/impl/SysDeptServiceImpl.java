package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysDeptMapper;
import com.atqgh.entity.SysDept;
import com.atqgh.service.SysDeptService;
import com.atqgh.vo.SysDeptQueryVo;
import com.atqgh.vo.SysDeptAddVo;
import com.atqgh.vo.SysDeptUptVo;
import com.atqgh.dto.SysDeptDto;
import com.atqgh.dto.SysDeptPageDto;
import java.util.Set;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 部门表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:10
 */
@Slf4j
@Service("sysDeptService")
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements SysDeptService {

    @Resource
    private SysDeptMapper sysDeptMapper;

    @Override
    public int insert(SysDeptAddVo addVo) {

        SysDept addEntity = new SysDept();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysDeptUptVo updateVo) {

        SysDept uptEntity = new SysDept();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysDeptDto getDetail(Long deptId) {

        SysDept entity = this.baseMapper.selectById(deptId);
        SysDeptDto dto = new SysDeptDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysDeptPageDto> queryPageByWrapper(SysDeptQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysDept> queryWrapper = this.sysDeptMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysDept> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysDeptPageDto.class));
//    }

}
