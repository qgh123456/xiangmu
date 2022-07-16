package com.atqgh.service;

import com.atqgh.vo.SysUserRoleQueryVo;
import com.atqgh.vo.SysUserRoleAddVo;
import com.atqgh.vo.SysUserRoleUptVo;
import com.atqgh.dto.SysUserRoleDto;
import com.atqgh.dto.SysUserRolePageDto;
import com.atqgh.entity.SysUserRole;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 用户和角色关联表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
public interface SysUserRoleService extends IService<SysUserRole> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysUserRoleAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysUserRoleUptVo updateVo);

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
    SysUserRoleDto getDetail(@NonNull Long userId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysUserRolePageDto> queryPageByWrapper(@NonNull SysUserRoleQueryVo queryVo);

}
