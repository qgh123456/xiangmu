package com.atqgh.service.impl;

import com.atqgh.common.enums.ResultCodeEnum;
import com.atqgh.common.exception.MicroException;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.GenTableColumnMapper;
import com.atqgh.entity.GenTableColumn;
import com.atqgh.service.GenTableColumnService;
import com.atqgh.vo.GenTableColumnAddVo;
import com.atqgh.vo.GenTableColumnUptVo;
import com.atqgh.dto.GenTableColumnDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 代码生成业务表字段 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
@Slf4j
@Service("genTableColumnService")
public class GenTableColumnServiceImpl extends ServiceImpl<GenTableColumnMapper, GenTableColumn> implements GenTableColumnService {

    @Resource
    private GenTableColumnMapper genTableColumnMapper;

    @Override
    public int insert(@NonNull GenTableColumnAddVo addVo) {

        GenTableColumn addEntity = new GenTableColumn();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull GenTableColumnUptVo updateVo) {

        GenTableColumn uptEntity = new GenTableColumn();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public GenTableColumnDto getDetail(@NonNull Long columnId) {

        GenTableColumn entity = this.baseMapper.selectById(columnId);
        GenTableColumnDto dto = new GenTableColumnDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<GenTableColumnPageDto> queryPageByWrapper(@NonNull GenTableColumnQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<GenTableColumn> queryWrapper = this.genTableColumnMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<GenTableColumn> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, GenTableColumnPageDto.class));
//    }

}
