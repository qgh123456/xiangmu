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
import com.atqgh.vo.SysUserPostQueryVo;
import com.atqgh.vo.SysUserPostAddVo;
import com.atqgh.vo.SysUserPostUptVo;
import com.atqgh.dto.SysUserPostDto;
import com.atqgh.dto.SysUserPostPageDto;
import com.atqgh.service.SysUserPostService;
import java.util.Set;

/**
 * 用户与岗位关联.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Api(tags = "用户与岗位关联")
@RestController
@RequestMapping("/sysUserPost")
public class SysUserPostController {

    @Resource
    private SysUserPostService sysUserPostService;

    /**
     * 分页查询用户与岗位关联.
     *
     * @param queryVo              查询对象实体
     * @return page
     */
//    @GetMapping("/page")
//    @ApiOperation(value = "分页查询用户与岗位关联", notes = "分页查询用户与岗位关联", produces = "application/json")
//    public Result<PageInfo<SysUserPostPageDto>, Object> page(@ApiParam("查询参数") SysUserPostQueryVo queryVo) {
//
//        PageInfo<SysUserPostPageDto> pageInfo = this.sysUserPostService.queryPageByWrapper(queryVo);
//        return Result.success(pageInfo);
//    }

    /**
     * 新增用户与岗位关联.
     *
     * @param addVo     新增用户与岗位关联参数
     * @return          新增成功
     */
    @ApiOperation(value = "新增用户与岗位关联", notes = "新增用户与岗位关联", produces = "application/json")
    @PostMapping("/add")
    public ResultObj add(@ApiParam("新增参数") @Valid @RequestBody SysUserPostAddVo addVo) {

        this.sysUserPostService.insert(addVo);
        return ResultObj.ok("新增用户与岗位关联成功");
    }

    /**
     * 修改用户与岗位关联.
     *
     * @param updateVo  用户与岗位关联参数
     * @return string   修改是否成功提示信息
     */
    @PutMapping("/update")
    @ApiOperation(value = "修改用户与岗位关联", notes = "修改用户与岗位关联", produces = "application/json")
    public ResultObj update(@ApiParam("修改参数") @Valid @RequestBody SysUserPostUptVo updateVo) {

        this.sysUserPostService.update(updateVo);
        return ResultObj.ok("修改用户与岗位关联成功");
    }

    /**
     * 批量删除用户与岗位关联.
     *
     * @param pks 主键
     * @return 删除成功
     */
    @DeleteMapping("/batchDel/{pks}")
    @ApiOperation(value = "根据用户与岗位关联主键批量删除数据", notes = "根据用户与岗位关联主键批量删除数据", produces = "application/json")
    public ResultObj batchDel(@ApiParam("主键") @PathVariable(value = "pks") Set<String> pks) {

        // 通过主键批量删除数据
        this.sysUserPostService.batchDel(pks);
        return ResultObj.ok("批量删除成功");
    }

    /**
    * 查看用户与岗位关联.
    *
    * @param userCode 主键
    * @return 详情信息
    */
    @GetMapping("/{userCode}")
    @ApiOperation(value = "根据userCode主键查看数据", notes = "根据userCode主键查看数据", produces = "application/json")
    public ResultObj getDetail(@PathVariable(value = "userCode") String userCode) {

        // 通过主键查看数据
        SysUserPostDto dto = this.sysUserPostService.getDetail(userCode);
        return ResultObj.ok().setData(dto);
    }

}