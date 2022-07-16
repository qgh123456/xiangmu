package com.atqgh.service;

import com.atqgh.vo.GenTableColumnAddVo;
import com.atqgh.vo.GenTableColumnUptVo;
import com.atqgh.dto.GenTableColumnDto;
import com.atqgh.entity.GenTableColumn;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 代码生成业务表字段.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
public interface GenTableColumnService extends IService<GenTableColumn> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull GenTableColumnAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull GenTableColumnUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(@NonNull Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param columnId 主键
     * @return 返回集合数据
     */
    GenTableColumnDto getDetail(@NonNull Long columnId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<GenTableColumnPageDto> queryPageByWrapper(@NonNull GenTableColumnQueryVo queryVo);

}
