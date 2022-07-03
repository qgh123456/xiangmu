package com.atqgh.service;

import com.atqgh.vo.SysOperLogQueryVo;
import com.atqgh.vo.SysOperLogAddVo;
import com.atqgh.vo.SysOperLogUptVo;
import com.atqgh.dto.SysOperLogDto;
import com.atqgh.dto.SysOperLogPageDto;
import com.atqgh.entity.SysOperLog;
import java.util.Set;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 操作日志记录.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
public interface SysOperLogService extends IService<SysOperLog> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(SysOperLogAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(SysOperLogUptVo updateVo);

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
    SysOperLogDto getDetail(Long id);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysOperLogPageDto> queryPageByWrapper(SysOperLogQueryVo queryVo);

}
