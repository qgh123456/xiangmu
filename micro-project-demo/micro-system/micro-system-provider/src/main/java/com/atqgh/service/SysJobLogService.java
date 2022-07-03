package com.atqgh.service;

import com.atqgh.vo.SysJobLogQueryVo;
import com.atqgh.vo.SysJobLogAddVo;
import com.atqgh.vo.SysJobLogUptVo;
import com.atqgh.dto.SysJobLogDto;
import com.atqgh.dto.SysJobLogPageDto;
import com.atqgh.entity.SysJobLog;
import java.util.Set;
import java.util.List;
//
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 定时任务调度日志表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:08
 */
public interface SysJobLogService extends IService<SysJobLog> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(SysJobLogAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(SysJobLogUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param id 主键
     * @return 返回集合数据
     */
    SysJobLogDto getDetail(Long id);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysJobLogPageDto> queryPageByWrapper(SysJobLogQueryVo queryVo);

}
