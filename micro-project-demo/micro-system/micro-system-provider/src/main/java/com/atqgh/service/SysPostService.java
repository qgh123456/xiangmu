package com.atqgh.service;

import com.atqgh.vo.SysPostAddVo;
import com.atqgh.vo.SysPostUptVo;
import com.atqgh.dto.SysPostDto;
import com.atqgh.entity.SysPost;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 岗位信息表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
public interface SysPostService extends IService<SysPost> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysPostAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysPostUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(@NonNull Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param postId 主键
     * @return 返回集合数据
     */
    SysPostDto getDetail(@NonNull Long postId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysPostPageDto> queryPageByWrapper(@NonNull SysPostQueryVo queryVo);

}
