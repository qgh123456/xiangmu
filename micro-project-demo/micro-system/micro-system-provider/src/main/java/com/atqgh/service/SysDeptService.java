package com.atqgh.service;

import com.atqgh.vo.SysDeptAddVo;
import com.atqgh.vo.SysDeptUptVo;
import com.atqgh.dto.SysDeptDto;
import com.atqgh.entity.SysDept;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 部门表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
public interface SysDeptService extends IService<SysDept> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysDeptAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysDeptUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(@NonNull Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param deptId 主键
     * @return 返回集合数据
     */
    SysDeptDto getDetail(@NonNull Long deptId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysDeptPageDto> queryPageByWrapper(@NonNull SysDeptQueryVo queryVo);

}
