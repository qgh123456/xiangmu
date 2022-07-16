package com.atqgh.service;

import com.atqgh.vo.SysRoleMenuAddVo;
import com.atqgh.vo.SysRoleMenuUptVo;
import com.atqgh.dto.SysRoleMenuDto;
import com.atqgh.entity.SysRoleMenu;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 角色和菜单关联表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
public interface SysRoleMenuService extends IService<SysRoleMenu> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysRoleMenuAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysRoleMenuUptVo updateVo);

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
    SysRoleMenuDto getDetail(@NonNull Long roleId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysRoleMenuPageDto> queryPageByWrapper(@NonNull SysRoleMenuQueryVo queryVo);

}
