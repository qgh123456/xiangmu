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
import com.atqgh.vo.SysLogininforQueryVo;
import com.atqgh.vo.SysLogininforAddVo;
import com.atqgh.vo.SysLogininforUptVo;
import com.atqgh.dto.SysLogininforDto;
import com.atqgh.dto.SysLogininforPageDto;
import com.atqgh.service.SysLogininforService;
import java.util.Set;

/**
 * 系统访问记.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Api(tags = "系统访问记")
@RestController
@RequestMapping("/sysLogininfor")
public class SysLogininforController {

    @Resource
    private SysLogininforService sysLogininforService;

    /**
     * 分页查询系统访问记.
     *
     * @param queryVo              查询对象实体
     * @return page
     */
//    @GetMapping("/page")
//    @ApiOperation(value = "分页查询系统访问记", notes = "分页查询系统访问记", produces = "application/json")
//    public Result<PageInfo<SysLogininforPageDto>, Object> page(@ApiParam("查询参数") SysLogininforQueryVo queryVo) {
//
//        PageInfo<SysLogininforPageDto> pageInfo = this.sysLogininforService.queryPageByWrapper(queryVo);
//        return Result.success(pageInfo);
//    }

    /**
     * 新增系统访问记.
     *
     * @param addVo     新增系统访问记参数
     * @return          新增成功
     */
    @ApiOperation(value = "新增系统访问记", notes = "新增系统访问记", produces = "application/json")
    @PostMapping("/add")
    public ResultObj add(@ApiParam("新增参数") @Valid @RequestBody SysLogininforAddVo addVo) {

        this.sysLogininforService.insert(addVo);
        return ResultObj.ok("新增系统访问记成功");
    }

    /**
     * 修改系统访问记.
     *
     * @param updateVo  系统访问记参数
     * @return string   修改是否成功提示信息
     */
    @PutMapping("/update")
    @ApiOperation(value = "修改系统访问记", notes = "修改系统访问记", produces = "application/json")
    public ResultObj update(@ApiParam("修改参数") @Valid @RequestBody SysLogininforUptVo updateVo) {

        this.sysLogininforService.update(updateVo);
        return ResultObj.ok("修改系统访问记成功");
    }

    /**
     * 批量删除系统访问记.
     *
     * @param pks 主键
     * @return 删除成功
     */
    @DeleteMapping("/batchDel/{pks}")
    @ApiOperation(value = "根据系统访问记主键批量删除数据", notes = "根据系统访问记主键批量删除数据", produces = "application/json")
    public ResultObj batchDel(@ApiParam("主键") @PathVariable(value = "pks") Set<Long> pks) {

        // 通过主键批量删除数据
        this.sysLogininforService.batchDel(pks);
        return ResultObj.ok("批量删除成功");
    }

    /**
    * 查看系统访问记.
    *
    * @param id 主键
    * @return 详情信息
    */
    @GetMapping("/{id}")
    @ApiOperation(value = "根据id主键查看数据", notes = "根据id主键查看数据", produces = "application/json")
    public ResultObj getDetail(@PathVariable(value = "id") Long id) {

        // 通过主键查看数据
        SysLogininforDto dto = this.sysLogininforService.getDetail(id);
        return ResultObj.ok().setData(dto);
    }

}
