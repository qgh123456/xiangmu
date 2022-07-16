package com.atqgh.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.atqgh.mapper.SysNoticeMapper;
import com.atqgh.entity.SysNotice;
import com.atqgh.service.SysNoticeService;
import com.atqgh.vo.SysNoticeAddVo;
import com.atqgh.vo.SysNoticeUptVo;
import com.atqgh.dto.SysNoticeDto;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.lang.NonNull;

/**
 * 通知公告表 业务逻辑.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Slf4j
@Service("sysNoticeService")
public class SysNoticeServiceImpl extends ServiceImpl<SysNoticeMapper, SysNotice> implements SysNoticeService {

    @Resource
    private SysNoticeMapper sysNoticeMapper;

    @Override
    public int insert(@NonNull SysNoticeAddVo addVo) {

        SysNotice addEntity = new SysNotice();
        BeanUtils.copyProperties(addVo, addEntity);
        return this.baseMapper.insert(addEntity);
    }

    @Override
    public int update(@NonNull SysNoticeUptVo updateVo) {

        SysNotice uptEntity = new SysNotice();
        BeanUtils.copyProperties(updateVo, uptEntity);
        int count = this.baseMapper.updateById(uptEntity);
        return count;
    }

    @Override
    public void batchDel(@NonNull Set<Integer> pks) {

        this.baseMapper.deleteBatchIds(pks);
    }

    @Override
    public SysNoticeDto getDetail(@NonNull Integer noticeId) {

        SysNotice entity = this.baseMapper.selectById(noticeId);
        SysNoticeDto dto = new SysNoticeDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
