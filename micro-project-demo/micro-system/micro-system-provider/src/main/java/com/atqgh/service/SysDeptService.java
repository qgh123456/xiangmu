package com.atqgh.service;

import com.atqgh.vo.SysDeptQueryVo;
import com.atqgh.vo.SysDeptAddVo;
import com.atqgh.vo.SysDeptUptVo;
import com.atqgh.dto.SysDeptDto;
import com.atqgh.dto.SysDeptPageDto;
import com.atqgh.entity.SysDept;
import java.util.Set;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 部门表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:10
 */
public interface SysDeptService extends IService<SysDept> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(SysDeptAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(SysDeptUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param deptId 主键
     * @return 返回集合数据
     */
    SysDeptDto getDetail(Long deptId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysDeptPageDto> queryPageByWrapper(SysDeptQueryVo queryVo);

}
