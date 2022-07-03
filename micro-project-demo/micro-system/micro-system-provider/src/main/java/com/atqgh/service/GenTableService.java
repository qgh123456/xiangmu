package com.atqgh.service;

import com.atqgh.vo.GenTableQueryVo;
import com.atqgh.vo.GenTableAddVo;
import com.atqgh.vo.GenTableUptVo;
import com.atqgh.dto.GenTableDto;
import com.atqgh.dto.GenTablePageDto;
import com.atqgh.entity.GenTable;
import java.util.Set;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 代码生成业务表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:08
 */
public interface GenTableService extends IService<GenTable> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(GenTableAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(GenTableUptVo updateVo);

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
    GenTableDto getDetail(Long id);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<GenTablePageDto> queryPageByWrapper(GenTableQueryVo queryVo);

}
