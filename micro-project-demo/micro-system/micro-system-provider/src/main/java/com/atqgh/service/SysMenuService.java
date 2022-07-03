package com.atqgh.service;

import com.atqgh.vo.SysMenuQueryVo;
import com.atqgh.vo.SysMenuAddVo;
import com.atqgh.vo.SysMenuUptVo;
import com.atqgh.dto.SysMenuDto;
import com.atqgh.dto.SysMenuPageDto;
import com.atqgh.entity.SysMenu;
import java.util.Set;
import java.util.List;
//
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 菜单权限表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
public interface SysMenuService extends IService<SysMenu> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(SysMenuAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(SysMenuUptVo updateVo);

     /**
     * 根据主键批量删除数据.
     *
     * @param pks 主键
     */
    void batchDel(Set<Long> pks);

    /**
     * 根据主键查询.
     *
     * @param id 主键
     * @return 返回集合数据
     */
    SysMenuDto getDetail(Long id);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysMenuPageDto> queryPageByWrapper(SysMenuQueryVo queryVo);

}
