package com.atqgh.controller;

import com.atqgh.common.utils.ResultObj;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import io.swagger.annotations.ApiParam;
import com.atqgh.vo.SysMenuAddVo;
import com.atqgh.vo.SysMenuUptVo;
import com.atqgh.dto.SysMenuDto;
import com.atqgh.service.SysMenuService;
import java.util.Set;

/**
 * 菜单权限.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Api(tags = "菜单权限")
@RestController
@RequestMapping("/sysMenu")
public class SysMenuController {

    @Resource
    private SysMenuService sysMenuService;

    /**
     * 新增菜单权限.
     *
     * @param addVo     新增菜单权限参数
     * @return          新增成功
     */
    @ApiOperation(value = "新增菜单权限", notes = "新增菜单权限", produces = "application/json")
    @PostMapping("/add")
    public ResultObj add(@ApiParam("新增参数") @Valid @RequestBody SysMenuAddVo addVo) {

        this.sysMenuService.insert(addVo);
        return ResultObj.ok("新增菜单权限成功");
    }

    /**
     * 修改菜单权限.
     *
     * @param updateVo  菜单权限参数
     * @return string   修改是否成功提示信息
     */
    @PutMapping("/update")
    @ApiOperation(value = "修改菜单权限", notes = "修改菜单权限", produces = "application/json")
    public ResultObj update(@ApiParam("修改参数") @Valid @RequestBody SysMenuUptVo updateVo) {

        this.sysMenuService.update(updateVo);
        return ResultObj.ok("修改菜单权限成功");
    }

    /**
     * 批量删除菜单权限.
     *
     * @param pks 主键
     * @return 删除成功
     */
    @DeleteMapping("/batchDel/{pks}")
    @ApiOperation(value = "根据菜单权限主键批量删除数据", notes = "根据菜单权限主键批量删除数据", produces = "application/json")
    public ResultObj batchDel(@ApiParam("主键") @PathVariable(value = "pks") Set<Long> pks) {

        // 通过主键批量删除数据
        this.sysMenuService.batchDel(pks);
        return ResultObj.ok("批量删除成功");
    }

    /**
    * 查看菜单权限.
    *
    * @param menuId 主键
    * @return 详情信息
    */
    @GetMapping("/{menuId}")
    @ApiOperation(value = "根据menuId主键查看数据", notes = "根据menuId主键查看数据", produces = "application/json")
    public ResultObj getDetail(@PathVariable(value = "menuId") Long menuId) {

        // 通过主键查看数据
        SysMenuDto dto = this.sysMenuService.getDetail(menuId);
        return ResultObj.ok().setData(dto);
    }

}
