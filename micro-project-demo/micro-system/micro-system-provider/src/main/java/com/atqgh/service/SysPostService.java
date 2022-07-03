package com.atqgh.service;

import com.atqgh.vo.SysPostQueryVo;
import com.atqgh.vo.SysPostAddVo;
import com.atqgh.vo.SysPostUptVo;
import com.atqgh.dto.SysPostDto;
import com.atqgh.dto.SysPostPageDto;
import com.atqgh.entity.SysPost;
import java.util.Set;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 岗位信息表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:10
 */
public interface SysPostService extends IService<SysPost> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(SysPostAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(SysPostUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param postId 主键
     * @return 返回集合数据
     */
    SysPostDto getDetail(Long postId);

}
