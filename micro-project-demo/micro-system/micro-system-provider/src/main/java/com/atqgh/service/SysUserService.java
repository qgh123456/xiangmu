package com.atqgh.service;

import com.atqgh.system.dto.SysUserDto;
import com.atqgh.vo.SysUserAddVo;
import com.atqgh.vo.SysUserUptVo;
import com.atqgh.entity.SysUser;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户信息表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:10
 */
public interface SysUserService extends IService<SysUser> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(SysUserAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(SysUserUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param userId 主键
     * @return 返回集合数据
     */
    SysUserDto getDetail(Long userId);

    /**
     * 通过用户名获取用户详情.
     *
     * @param username 用户名
     * @return 详情
     */
    SysUserDto findByUsername(String username);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysUserPageDto> queryPageByWrapper(SysUserQueryVo queryVo);

}
