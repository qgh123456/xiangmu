package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.GenTableMapper;
import com.atqgh.entity.GenTable;
import com.atqgh.service.GenTableService;
import com.atqgh.vo.GenTableAddVo;
import com.atqgh.vo.GenTableUptVo;
import com.atqgh.dto.GenTableDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 代码生成业务表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
@Slf4j
@Service("genTableService")
public class GenTableServiceImpl extends ServiceImpl<GenTableMapper, GenTable> implements GenTableService {

    @Resource
    private GenTableMapper genTableMapper;

    @Override
    public int insert(@NonNull GenTableAddVo addVo) {

        GenTable addEntity = new GenTable();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull GenTableUptVo updateVo) {

        GenTable uptEntity = new GenTable();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public GenTableDto getDetail(@NonNull Long tableId) {

        GenTable entity = this.baseMapper.selectById(tableId);
        GenTableDto dto = new GenTableDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
