package com.atqgh.service;

import com.atqgh.vo.SysUserQueryVo;
import com.atqgh.vo.SysUserAddVo;
import com.atqgh.vo.SysUserUptVo;
import com.atqgh.dto.SysUserDto;
import com.atqgh.dto.SysUserPageDto;
import com.atqgh.entity.SysUser;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 用户信息表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
public interface SysUserService extends IService<SysUser> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysUserAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysUserUptVo updateVo);

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
    SysUserDto getDetail(@NonNull Long userId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysUserPageDto> queryPageByWrapper(@NonNull SysUserQueryVo queryVo);

}
