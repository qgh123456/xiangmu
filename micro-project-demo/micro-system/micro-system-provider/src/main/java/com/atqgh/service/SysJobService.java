package com.atqgh.service;

import com.atqgh.vo.SysJobQueryVo;
import com.atqgh.vo.SysJobAddVo;
import com.atqgh.vo.SysJobUptVo;
import com.atqgh.dto.SysJobDto;
import com.atqgh.dto.SysJobPageDto;
import com.atqgh.entity.SysJob;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 定时任务调度表.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
public interface SysJobService extends IService<SysJob> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysJobAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysJobUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(@NonNull Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param jobId 主键
     * @return 返回集合数据
     */
    SysJobDto getDetail(@NonNull Long jobId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysJobPageDto> queryPageByWrapper(@NonNull SysJobQueryVo queryVo);

}
