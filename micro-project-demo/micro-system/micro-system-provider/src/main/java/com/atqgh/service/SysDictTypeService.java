package com.atqgh.service;

import com.atqgh.vo.SysDictTypeQueryVo;
import com.atqgh.vo.SysDictTypeAddVo;
import com.atqgh.vo.SysDictTypeUptVo;
import com.atqgh.dto.SysDictTypeDto;
import com.atqgh.dto.SysDictTypePageDto;
import com.atqgh.entity.SysDictType;
import java.util.Set;
import java.util.List;
//
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 字典类型表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
public interface SysDictTypeService extends IService<SysDictType> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(SysDictTypeAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(SysDictTypeUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(Set<String> pks);

    /**
     * 根据主键查询.
     *
     * @param dictType 主键
     * @return 返回集合数据
     */
    SysDictTypeDto getDetail(String dictType);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysDictTypePageDto> queryPageByWrapper(SysDictTypeQueryVo queryVo);

}
