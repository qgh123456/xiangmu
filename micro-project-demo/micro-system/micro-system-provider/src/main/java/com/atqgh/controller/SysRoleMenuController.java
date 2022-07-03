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
import com.atqgh.vo.SysRoleMenuQueryVo;
import com.atqgh.vo.SysRoleMenuAddVo;
import com.atqgh.vo.SysRoleMenuUptVo;
import com.atqgh.dto.SysRoleMenuDto;
import com.atqgh.dto.SysRoleMenuPageDto;
import com.atqgh.service.SysRoleMenuService;
import java.util.Set;

/**
 * 角色和菜单关联.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Api(tags = "角色和菜单关联")
@RestController
@RequestMapping("/sysRoleMenu")
public class SysRoleMenuController {

    @Resource
    private SysRoleMenuService sysRoleMenuService;

    /**
     * 分页查询角色和菜单关联.
     *
     * @param queryVo              查询对象实体
     * @return page
     */
//    @GetMapping("/page")
//    @ApiOperation(value = "分页查询角色和菜单关联", notes = "分页查询角色和菜单关联", produces = "application/json")
//    public Result<PageInfo<SysRoleMenuPageDto>, Object> page(@ApiParam("查询参数") SysRoleMenuQueryVo queryVo) {
//
//        PageInfo<SysRoleMenuPageDto> pageInfo = this.sysRoleMenuService.queryPageByWrapper(queryVo);
//        return Result.success(pageInfo);
//    }

    /**
     * 新增角色和菜单关联.
     *
     * @param addVo     新增角色和菜单关联参数
     * @return          新增成功
     */
    @ApiOperation(value = "新增角色和菜单关联", notes = "新增角色和菜单关联", produces = "application/json")
    @PostMapping("/add")
    public ResultObj add(@ApiParam("新增参数") @Valid @RequestBody SysRoleMenuAddVo addVo) {

        this.sysRoleMenuService.insert(addVo);
        return ResultObj.ok("新增角色和菜单关联成功");
    }

    /**
     * 修改角色和菜单关联.
     *
     * @param updateVo  角色和菜单关联参数
     * @return string   修改是否成功提示信息
     */
    @PutMapping("/update")
    @ApiOperation(value = "修改角色和菜单关联", notes = "修改角色和菜单关联", produces = "application/json")
    public ResultObj update(@ApiParam("修改参数") @Valid @RequestBody SysRoleMenuUptVo updateVo) {

        this.sysRoleMenuService.update(updateVo);
        return ResultObj.ok("修改角色和菜单关联成功");
    }

    /**
     * 批量删除角色和菜单关联.
     *
     * @param pks 主键
     * @return 删除成功
     */
    @DeleteMapping("/batchDel/{pks}")
    @ApiOperation(value = "根据角色和菜单关联主键批量删除数据", notes = "根据角色和菜单关联主键批量删除数据", produces = "application/json")
    public ResultObj batchDel(@ApiParam("主键") @PathVariable(value = "pks") Set<String> pks) {

        // 通过主键批量删除数据
        this.sysRoleMenuService.batchDel(pks);
        return ResultObj.ok("批量删除成功");
    }

    /**
    * 查看角色和菜单关联.
    *
    * @param roleCode 主键
    * @return 详情信息
    */
    @GetMapping("/{roleCode}")
    @ApiOperation(value = "根据roleCode主键查看数据", notes = "根据roleCode主键查看数据", produces = "application/json")
    public ResultObj getDetail(@PathVariable(value = "roleCode") String roleCode) {

        // 通过主键查看数据
        SysRoleMenuDto dto = this.sysRoleMenuService.getDetail(roleCode);
        return ResultObj.ok().setData(dto);
    }

}
