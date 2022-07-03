package com.atqgh.service;

import com.atqgh.vo.GenTableColumnQueryVo;
import com.atqgh.vo.GenTableColumnAddVo;
import com.atqgh.vo.GenTableColumnUptVo;
import com.atqgh.dto.GenTableColumnDto;
import com.atqgh.dto.GenTableColumnPageDto;
import com.atqgh.entity.GenTableColumn;
import java.util.Set;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 代码生成业务表字段.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:08
 */
public interface GenTableColumnService extends IService<GenTableColumn> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(GenTableColumnAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(GenTableColumnUptVo updateVo);

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
    GenTableColumnDto getDetail(Long id);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<GenTableColumnPageDto> queryPageByWrapper(GenTableColumnQueryVo queryVo);

}
