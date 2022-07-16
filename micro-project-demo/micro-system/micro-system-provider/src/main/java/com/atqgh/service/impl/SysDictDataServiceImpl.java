package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysDictDataMapper;
import com.atqgh.entity.SysDictData;
import com.atqgh.service.SysDictDataService;
import com.atqgh.vo.SysDictDataAddVo;
import com.atqgh.vo.SysDictDataUptVo;
import com.atqgh.dto.SysDictDataDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 字典数据表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Slf4j
@Service("sysDictDataService")
public class SysDictDataServiceImpl extends ServiceImpl<SysDictDataMapper, SysDictData> implements SysDictDataService {

    @Resource
    private SysDictDataMapper sysDictDataMapper;

    @Override
    public int insert(@NonNull SysDictDataAddVo addVo) {

        SysDictData addEntity = new SysDictData();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysDictDataUptVo updateVo) {

        SysDictData uptEntity = new SysDictData();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysDictDataDto getDetail(@NonNull Long dictCode) {

        SysDictData entity = this.baseMapper.selectById(dictCode);
        SysDictDataDto dto = new SysDictDataDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
