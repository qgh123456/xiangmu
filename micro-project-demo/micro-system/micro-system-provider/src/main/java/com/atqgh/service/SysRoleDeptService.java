package com.atqgh.service;

import com.atqgh.vo.SysRoleDeptQueryVo;
import com.atqgh.vo.SysRoleDeptAddVo;
import com.atqgh.vo.SysRoleDeptUptVo;
import com.atqgh.dto.SysRoleDeptDto;
import com.atqgh.dto.SysRoleDeptPageDto;
import com.atqgh.entity.SysRoleDept;
import java.util.Set;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 角色和部门关联表.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
public interface SysRoleDeptService extends IService<SysRoleDept> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(SysRoleDeptAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(SysRoleDeptUptVo updateVo);

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
    SysRoleDeptDto getDetail(String roleCode);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysRoleDeptPageDto> queryPageByWrapper(SysRoleDeptQueryVo queryVo);

}
