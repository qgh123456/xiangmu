package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.GenTableMapper;
import com.atqgh.entity.GenTable;
import com.atqgh.service.GenTableService;
import com.atqgh.vo.GenTableQueryVo;
import com.atqgh.vo.GenTableAddVo;
import com.atqgh.vo.GenTableUptVo;
import com.atqgh.dto.GenTableDto;
import com.atqgh.dto.GenTablePageDto;
import java.util.Set;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 代码生成业务表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:08
 */
@Slf4j
@Service("genTableService")
public class GenTableServiceImpl extends ServiceImpl<GenTableMapper, GenTable> implements GenTableService {

    @Resource
    private GenTableMapper genTableMapper;

    @Override
    public int insert(GenTableAddVo addVo) {

        GenTable addEntity = new GenTable();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(GenTableUptVo updateVo) {

        GenTable uptEntity = new GenTable();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);

        return count;
    }

    @Override
    public void batchDel(Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public GenTableDto getDetail(Long id) {

        GenTable entity = this.baseMapper.selectById(id);
        GenTableDto dto = new GenTableDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<GenTablePageDto> queryPageByWrapper(GenTableQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<GenTable> queryWrapper = this.genTableMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<GenTable> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, GenTablePageDto.class));
//    }

}
