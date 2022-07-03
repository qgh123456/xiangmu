package com.atqgh.service;

import com.atqgh.vo.SysJobQueryVo;
import com.atqgh.vo.SysJobAddVo;
import com.atqgh.vo.SysJobUptVo;
import com.atqgh.dto.SysJobDto;
import com.atqgh.dto.SysJobPageDto;
import com.atqgh.entity.SysJob;
import java.util.Set;
import java.util.List;
//
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 定时任务调度表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
public interface SysJobService extends IService<SysJob> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(SysJobAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(SysJobUptVo updateVo);

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
    SysJobDto getDetail(Long id);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysJobPageDto> queryPageByWrapper(SysJobQueryVo queryVo);

}
