package com.atqgh.service;

import com.atqgh.vo.SysUserPostQueryVo;
import com.atqgh.vo.SysUserPostAddVo;
import com.atqgh.vo.SysUserPostUptVo;
import com.atqgh.dto.SysUserPostDto;
import com.atqgh.dto.SysUserPostPageDto;
import com.atqgh.entity.SysUserPost;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 用户与岗位关联表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
public interface SysUserPostService extends IService<SysUserPost> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysUserPostAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysUserPostUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(@NonNull Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param userId 主键
     * @return 返回集合数据
     */
    SysUserPostDto getDetail(@NonNull Long userId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysUserPostPageDto> queryPageByWrapper(@NonNull SysUserPostQueryVo queryVo);

}
