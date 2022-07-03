package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysDictDataMapper;
import com.atqgh.entity.SysDictData;
import com.atqgh.service.SysDictDataService;
import com.atqgh.vo.SysDictDataQueryVo;
import com.atqgh.vo.SysDictDataAddVo;
import com.atqgh.vo.SysDictDataUptVo;
import com.atqgh.dto.SysDictDataDto;
import com.atqgh.dto.SysDictDataPageDto;
import java.util.Set;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 字典数据表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Slf4j
@Service("sysDictDataService")
public class SysDictDataServiceImpl extends ServiceImpl<SysDictDataMapper, SysDictData> implements SysDictDataService {

    @Resource
    private SysDictDataMapper sysDictDataMapper;

    @Override
    public int insert(SysDictDataAddVo addVo) {

        SysDictData addEntity = new SysDictData();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysDictDataUptVo updateVo) {

        SysDictData uptEntity = new SysDictData();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysDictDataDto getDetail(Long code) {

        SysDictData entity = this.baseMapper.selectById(code);
        SysDictDataDto dto = new SysDictDataDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysDictDataPageDto> queryPageByWrapper(SysDictDataQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysDictData> queryWrapper = this.sysDictDataMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysDictData> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysDictDataPageDto.class));
//    }

}
