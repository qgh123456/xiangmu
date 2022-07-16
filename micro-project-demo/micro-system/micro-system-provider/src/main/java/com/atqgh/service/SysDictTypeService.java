package com.atqgh.service;

import com.atqgh.vo.SysDictTypeQueryVo;
import com.atqgh.vo.SysDictTypeAddVo;
import com.atqgh.vo.SysDictTypeUptVo;
import com.atqgh.dto.SysDictTypeDto;
import com.atqgh.dto.SysDictTypePageDto;
import com.atqgh.entity.SysDictType;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 字典类型表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
public interface SysDictTypeService extends IService<SysDictType> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysDictTypeAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysDictTypeUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(@NonNull Set<String> pks);

    /**
     * 根据主键查询.
     *
     * @param dictType 主键
     * @return 返回集合数据
     */
    SysDictTypeDto getDetail(@NonNull String dictType);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysDictTypePageDto> queryPageByWrapper(@NonNull SysDictTypeQueryVo queryVo);

}
