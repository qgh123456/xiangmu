package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysDictTypeMapper;
import com.atqgh.entity.SysDictType;
import com.atqgh.service.SysDictTypeService;
import com.atqgh.vo.SysDictTypeQueryVo;
import com.atqgh.vo.SysDictTypeAddVo;
import com.atqgh.vo.SysDictTypeUptVo;
import com.atqgh.dto.SysDictTypeDto;
import com.atqgh.dto.SysDictTypePageDto;
import java.util.Set;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 字典类型表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Slf4j
@Service("sysDictTypeService")
public class SysDictTypeServiceImpl extends ServiceImpl<SysDictTypeMapper, SysDictType> implements SysDictTypeService {

    @Resource
    private SysDictTypeMapper sysDictTypeMapper;

    @Override
    public int insert(SysDictTypeAddVo addVo) {

        SysDictType addEntity = new SysDictType();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysDictTypeUptVo updateVo) {

        SysDictType uptEntity = new SysDictType();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<String> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysDictTypeDto getDetail(String dictType) {

        SysDictType entity = this.baseMapper.selectById(dictType);
        SysDictTypeDto dto = new SysDictTypeDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysDictTypePageDto> queryPageByWrapper(SysDictTypeQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysDictType> queryWrapper = this.sysDictTypeMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysDictType> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysDictTypePageDto.class));
//    }

}
