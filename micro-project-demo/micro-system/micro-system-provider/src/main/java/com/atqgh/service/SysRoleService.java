package com.atqgh.service;

import com.atqgh.vo.SysRoleQueryVo;
import com.atqgh.vo.SysRoleAddVo;
import com.atqgh.vo.SysRoleUptVo;
import com.atqgh.dto.SysRoleDto;
import com.atqgh.dto.SysRolePageDto;
import com.atqgh.entity.SysRole;
import java.util.Set;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 角色信息表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
public interface SysRoleService extends IService<SysRole> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(SysRoleAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(SysRoleUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param roleId 主键
     * @return 返回集合数据
     */
    SysRoleDto getDetail(Long roleId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysRolePageDto> queryPageByWrapper(SysRoleQueryVo queryVo);

}
