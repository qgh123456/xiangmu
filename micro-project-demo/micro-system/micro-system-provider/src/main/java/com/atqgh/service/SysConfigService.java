package com.atqgh.service;

import com.atqgh.vo.SysConfigQueryVo;
import com.atqgh.vo.SysConfigAddVo;
import com.atqgh.vo.SysConfigUptVo;
import com.atqgh.dto.SysConfigDto;
import com.atqgh.dto.SysConfigPageDto;
import com.atqgh.entity.SysConfig;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 参数配置表.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
public interface SysConfigService extends IService<SysConfig> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysConfigAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysConfigUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(@NonNull Set<Integer> pks);

    /**
     * 根据主键查询.
     *
     * @param configId 主键
     * @return 返回集合数据
     */
    SysConfigDto getDetail(@NonNull Integer configId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysConfigPageDto> queryPageByWrapper(@NonNull SysConfigQueryVo queryVo);

}
