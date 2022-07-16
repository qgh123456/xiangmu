package com.atqgh.service;

import com.atqgh.vo.SysRoleQueryVo;
import com.atqgh.vo.SysRoleAddVo;
import com.atqgh.vo.SysRoleUptVo;
import com.atqgh.dto.SysRoleDto;
import com.atqgh.dto.SysRolePageDto;
import com.atqgh.entity.SysRole;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 角色信息表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
public interface SysRoleService extends IService<SysRole> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysRoleAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysRoleUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(@NonNull Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param roleId 主键
     * @return 返回集合数据
     */
    SysRoleDto getDetail(@NonNull Long roleId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysRolePageDto> queryPageByWrapper(@NonNull SysRoleQueryVo queryVo);

}
