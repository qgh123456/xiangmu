package com.atqgh.service;

import com.atqgh.vo.SysRoleMenuQueryVo;
import com.atqgh.vo.SysRoleMenuAddVo;
import com.atqgh.vo.SysRoleMenuUptVo;
import com.atqgh.dto.SysRoleMenuDto;
import com.atqgh.dto.SysRoleMenuPageDto;
import com.atqgh.entity.SysRoleMenu;
import java.util.Set;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 角色和菜单关联表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
public interface SysRoleMenuService extends IService<SysRoleMenu> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(SysRoleMenuAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(SysRoleMenuUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(Set<String> pks);

    /**
     * 根据主键查询.
     *
     * @param roleCode 主键
     * @return 返回集合数据
     */
    SysRoleMenuDto getDetail(String roleCode);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysRoleMenuPageDto> queryPageByWrapper(SysRoleMenuQueryVo queryVo);

}
