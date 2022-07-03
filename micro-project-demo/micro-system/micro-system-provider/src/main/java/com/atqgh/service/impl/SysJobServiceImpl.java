package com.atqgh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysJobMapper;
import com.atqgh.entity.SysJob;
import com.atqgh.service.SysJobService;
import com.atqgh.vo.SysJobQueryVo;
import com.atqgh.vo.SysJobAddVo;
import com.atqgh.vo.SysJobUptVo;
import com.atqgh.dto.SysJobDto;
import com.atqgh.dto.SysJobPageDto;
import java.util.Set;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 定时任务调度表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Slf4j
@Service("sysJobService")
public class SysJobServiceImpl extends ServiceImpl<SysJobMapper, SysJob> implements SysJobService {

    @Resource
    private SysJobMapper sysJobMapper;

    @Override
    public int insert(SysJobAddVo addVo) {

        SysJob addEntity = new SysJob();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(SysJobUptVo updateVo) {

        SysJob uptEntity = new SysJob();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(Set<Long> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysJobDto getDetail(Long id) {

        SysJob entity = this.baseMapper.selectById(id);
        SysJobDto dto = new SysJobDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

//    @Override
//    public PageInfo<SysJobPageDto> queryPageByWrapper(SysJobQueryVo queryVo) {
//
//        // 设置分页
//        WebUtils.startPage();
//        // 构建查询条件
//        LambdaQueryWrapper<SysJob> queryWrapper = this.sysJobMapper.buildQueryPageWrapper(queryVo);
//        // 根据提交查询
//        List<SysJob> list = this.baseMapper.selectList(queryWrapper);
//        // 根据条件获取总数
//        return new PageInfo<>(CollectPropertiesCopyUtils.entityToDto(list, SysJobPageDto.class));
//    }

}
