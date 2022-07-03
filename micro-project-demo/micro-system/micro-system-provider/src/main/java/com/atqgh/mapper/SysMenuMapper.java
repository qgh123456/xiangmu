package com.atqgh.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atqgh.entity.SysMenu;
import com.atqgh.vo.SysMenuQueryVo;
import org.springframework.beans.BeanUtils;

/**
 * 菜单权限表.
 * 
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    /**
    * 构建查询参数对象.
    *
    * @param queryVo 查询实体
    * @return 查询对象
    */
    default LambdaQueryWrapper<SysMenu> buildQueryPageWrapper(SysMenuQueryVo queryVo) {

        SysMenu entity = new SysMenu();
        BeanUtils.copyProperties(queryVo, entity);
        LambdaQueryWrapper<SysMenu> wrapper = new QueryWrapper<SysMenu>().lambda();
        // TODO 构建查询参数
        return wrapper;
    }

}
