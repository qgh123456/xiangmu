package com.atqgh.service;

import com.atqgh.vo.SysJobLogQueryVo;
import com.atqgh.vo.SysJobLogAddVo;
import com.atqgh.vo.SysJobLogUptVo;
import com.atqgh.dto.SysJobLogDto;
import com.atqgh.dto.SysJobLogPageDto;
import com.atqgh.entity.SysJobLog;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 定时任务调度日志表.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
public interface SysJobLogService extends IService<SysJobLog> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysJobLogAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysJobLogUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(@NonNull Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param jobLogId 主键
     * @return 返回集合数据
     */
    SysJobLogDto getDetail(@NonNull Long jobLogId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysJobLogPageDto> queryPageByWrapper(@NonNull SysJobLogQueryVo queryVo);

}
