package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysDictTypeMapper;
import com.atqgh.entity.SysDictType;
import com.atqgh.service.SysDictTypeService;
import com.atqgh.vo.SysDictTypeAddVo;
import com.atqgh.vo.SysDictTypeUptVo;
import com.atqgh.dto.SysDictTypeDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 字典类型表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Slf4j
@Service("sysDictTypeService")
public class SysDictTypeServiceImpl extends ServiceImpl<SysDictTypeMapper, SysDictType> implements SysDictTypeService {

    @Resource
    private SysDictTypeMapper sysDictTypeMapper;

    @Override
    public int insert(@NonNull SysDictTypeAddVo addVo) {

        SysDictType addEntity = new SysDictType();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysDictTypeUptVo updateVo) {

        SysDictType uptEntity = new SysDictType();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<String> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysDictTypeDto getDetail(@NonNull String dictType) {

        SysDictType entity = this.baseMapper.selectById(dictType);
        SysDictTypeDto dto = new SysDictTypeDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
