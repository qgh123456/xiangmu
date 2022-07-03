package com.atqgh.controller;

import com.atqgh.common.utils.ResultObj;
import com.atqgh.system.dto.SysUserDto;
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
import com.atqgh.vo.SysUserAddVo;
import com.atqgh.vo.SysUserUptVo;
import com.atqgh.service.SysUserService;
import java.util.Set;

/**
 * 用户信息.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:10
 */
@Api(tags = "用户信息")
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    /**
     * 分页查询用户信息.
     *
     * @param queryVo              查询对象实体
     * @return page
     */
//    @GetMapping("/page")
//    @ApiOperation(value = "分页查询用户信息", notes = "分页查询用户信息", produces = "application/json")
//    public ResultObj page(@ApiParam("查询参数") SysUserQueryVo queryVo) {
//
//        PageInfo<SysUserPageDto> pageInfo = this.sysUserService.queryPageByWrapper(queryVo);
//        return Result.success(pageInfo);
//    }

    /**
     * 新增用户信息.
     *
     * @param addVo     新增用户信息参数
     * @return          新增成功
     */
    @ApiOperation(value = "新增用户信息", notes = "新增用户信息", produces = "application/json")
    @PostMapping("/add")
    public ResultObj add(@ApiParam("新增参数") @Valid @RequestBody SysUserAddVo addVo) {

        this.sysUserService.insert(addVo);
        return ResultObj.ok("新增用户信息成功");
    }

    /**
     * 修改用户信息.
     *
     * @param updateVo  用户信息参数
     * @return string   修改是否成功提示信息
     */
    @PutMapping("/update")
    @ApiOperation(value = "修改用户信息", notes = "修改用户信息", produces = "application/json")
    public ResultObj update(@ApiParam("修改参数") @Valid @RequestBody SysUserUptVo updateVo) {

        this.sysUserService.update(updateVo);
        return ResultObj.ok("修改用户信息成功");
    }

    /**
     * 批量删除用户信息.
     *
     * @param pks 主键
     * @return 删除成功
     */
    @DeleteMapping("/batchDel/{pks}")
    @ApiOperation(value = "根据用户信息主键批量删除数据", notes = "根据用户信息主键批量删除数据", produces = "application/json")
    public ResultObj batchDel(@ApiParam("主键") @PathVariable(value = "pks") Set<Long> pks) {

        // 通过主键批量删除数据
        this.sysUserService.batchDel(pks);
        return ResultObj.ok("批量删除成功");
    }

    /**
    * 查看用户信息.
    *
    * @param userId 主键
    * @return 详情信息
    */
    @GetMapping("/{userId}")
    @ApiOperation(value = "根据userId主键查看数据", notes = "根据userId主键查看数据", produces = "application/json")
    public ResultObj getDetail(@PathVariable(value = "userId") Long userId) {

        // 通过主键查看数据
        SysUserDto dto = this.sysUserService.getDetail(userId);
        return ResultObj.ok().setData(dto);
    }

    /**
    * 查看用户信息.
    *
    * @param username 用户名字
    * @return 详情信息
    */
    @GetMapping("/findByUsername/{username}")
    @ApiOperation(value = "根据userId主键查看数据", notes = "根据userId主键查看数据", produces = "application/json")
    public ResultObj findByUsername(@PathVariable(value = "username") String username) {

        // 通过主键查看数据
        SysUserDto dto = this.sysUserService.findByUsername(username);
        return ResultObj.ok().setData(dto);
    }

}
