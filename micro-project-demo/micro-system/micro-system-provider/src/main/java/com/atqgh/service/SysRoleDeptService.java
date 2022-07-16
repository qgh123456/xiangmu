package com.atqgh.service;

import com.atqgh.vo.SysRoleDeptQueryVo;
import com.atqgh.vo.SysRoleDeptAddVo;
import com.atqgh.vo.SysRoleDeptUptVo;
import com.atqgh.dto.SysRoleDeptDto;
import com.atqgh.dto.SysRoleDeptPageDto;
import com.atqgh.entity.SysRoleDept;
import java.util.Set;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 角色和部门关联表.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
public interface SysRoleDeptService extends IService<SysRoleDept> {

    /**
     * 新增.
     *
     * @param addVo 保存参数
     * @return 返回数据
     */
    int insert(@NonNull SysRoleDeptAddVo addVo);

    /**
     * 修改.
     *
     * @param updateVo 修改参数
     * @return 返回数据
     */
    int update(@NonNull SysRoleDeptUptVo updateVo);

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
    SysRoleDeptDto getDetail(@NonNull Long roleId);

    /**
     * 分页查询.
     *
     * @param queryVo 查询参数
     * @return 返回集合数据
     */
//    PageInfo<SysRoleDeptPageDto> queryPageByWrapper(@NonNull SysRoleDeptQueryVo queryVo);

}
