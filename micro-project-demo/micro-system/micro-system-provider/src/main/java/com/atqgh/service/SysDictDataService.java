package com.atqgh.service;

import com.atqgh.vo.SysDictDataQueryVo;
import com.atqgh.vo.SysDictDataAddVo;
import com.atqgh.vo.SysDictDataUptVo;
import com.atqgh.dto.SysDictDataDto;
import com.atqgh.dto.SysDictDataPageDto;
import com.atqgh.entity.SysDictData;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 字典数据表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
public interface SysDictDataService extends IService<SysDictData> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysDictDataAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysDictDataUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(@NonNull Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param dictCode 主键
     * @return 返回集合数据
     */
    SysDictDataDto getDetail(@NonNull Long dictCode);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysDictDataPageDto> queryPageByWrapper(@NonNull SysDictDataQueryVo queryVo);

}
