package com.atqgh.service;

import com.atqgh.vo.SysNoticeQueryVo;
import com.atqgh.vo.SysNoticeAddVo;
import com.atqgh.vo.SysNoticeUptVo;
import com.atqgh.dto.SysNoticeDto;
import com.atqgh.dto.SysNoticePageDto;
import com.atqgh.entity.SysNotice;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 通知公告表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
public interface SysNoticeService extends IService<SysNotice> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysNoticeAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysNoticeUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(@NonNull Set<Integer> pks);

    /**
     * 根据主键查询.
     *
     * @param noticeId 主键
     * @return 返回集合数据
     */
    SysNoticeDto getDetail(@NonNull Integer noticeId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysNoticePageDto> queryPageByWrapper(@NonNull SysNoticeQueryVo queryVo);

}
