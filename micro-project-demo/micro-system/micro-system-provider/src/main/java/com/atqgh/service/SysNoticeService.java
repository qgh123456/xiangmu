package com.atqgh.service;

import com.atqgh.vo.SysNoticeQueryVo;
import com.atqgh.vo.SysNoticeAddVo;
import com.atqgh.vo.SysNoticeUptVo;
import com.atqgh.dto.SysNoticeDto;
import com.atqgh.dto.SysNoticePageDto;
import com.atqgh.entity.SysNotice;
import java.util.Set;
import java.util.List;
//
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 通知公告表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:08
 */
public interface SysNoticeService extends IService<SysNotice> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(SysNoticeAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(SysNoticeUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(Set<Integer> pks);

    /**
     * 根据主键查询.
     *
     * @param id 主键
     * @return 返回集合数据
     */
    SysNoticeDto getDetail(Integer id);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysNoticePageDto> queryPageByWrapper(SysNoticeQueryVo queryVo);

}
