package com.atqgh.service;

import com.atqgh.vo.SysLogininforQueryVo;
import com.atqgh.vo.SysLogininforAddVo;
import com.atqgh.vo.SysLogininforUptVo;
import com.atqgh.dto.SysLogininforDto;
import com.atqgh.dto.SysLogininforPageDto;
import com.atqgh.entity.SysLogininfor;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 系统访问记录.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
public interface SysLogininforService extends IService<SysLogininfor> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysLogininforAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysLogininforUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(@NonNull Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param infoId 主键
     * @return 返回集合数据
     */
    SysLogininforDto getDetail(@NonNull Long infoId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysLogininforPageDto> queryPageByWrapper(@NonNull SysLogininforQueryVo queryVo);

}
