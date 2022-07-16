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
import com.atqgh.vo.SysRoleAddVo;
import com.atqgh.vo.SysRoleUptVo;
import com.atqgh.dto.SysRoleDto;
import com.atqgh.service.SysRoleService;
import java.util.Set;

/**
 * 角色信息.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Api(tags = "角色信息")
@RestController
@RequestMapping("/sysRole")
public class SysRoleController {

    @Resource
    private SysRoleService sysRoleService;

    /**
     * 新增角色信息.
     *
     * @param addVo     新增角色信息参数
     * @return          新增成功
     */
    @ApiOperation(value = "新增角色信息", notes = "新增角色信息", produces = "application/json")
    @PostMapping("/add")
    public ResultObj add(@ApiParam("新增参数") @Valid @RequestBody SysRoleAddVo addVo) {

        this.sysRoleService.insert(addVo);
        return ResultObj.ok("新增角色信息成功");
    }

    /**
     * 修改角色信息.
     *
     * @param updateVo  角色信息参数
     * @return string   修改是否成功提示信息
     */
    @PutMapping("/update")
    @ApiOperation(value = "修改角色信息", notes = "修改角色信息", produces = "application/json")
    public ResultObj update(@ApiParam("修改参数") @Valid @RequestBody SysRoleUptVo updateVo) {

        this.sysRoleService.update(updateVo);
        return ResultObj.ok("修改角色信息成功");
    }

    /**
     * 批量删除角色信息.
     *
     * @param pks 主键
     * @return 删除成功
     */
    @DeleteMapping("/batchDel/{pks}")
    @ApiOperation(value = "根据角色信息主键批量删除数据", notes = "根据角色信息主键批量删除数据", produces = "application/json")
    public ResultObj batchDel(@ApiParam("主键") @PathVariable(value = "pks") Set<Long> pks) {

        // 通过主键批量删除数据
        this.sysRoleService.batchDel(pks);
        return ResultObj.ok("批量删除成功");
    }

    /**
    * 查看角色信息.
    *
    * @param roleId 主键
    * @return 详情信息
    */
    @GetMapping("/{roleId}")
    @ApiOperation(value = "根据roleId主键查看数据", notes = "根据roleId主键查看数据", produces = "application/json")
    public ResultObj getDetail(@PathVariable(value = "roleId") Long roleId) {

        // 通过主键查看数据
        SysRoleDto dto = this.sysRoleService.getDetail(roleId);
        return ResultObj.ok().setData(dto);
    }

}
