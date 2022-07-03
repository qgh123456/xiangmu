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
import com.atqgh.vo.SysConfigAddVo;
import com.atqgh.vo.SysConfigUptVo;
import com.atqgh.dto.SysConfigDto;
import com.atqgh.service.SysConfigService;
import java.util.Set;

/**
 * 参数配置.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Api(tags = "参数配置")
@RestController
@RequestMapping("/sysConfig")
public class SysConfigController {

    @Resource
    private SysConfigService sysConfigService;

//    /**
//     * 分页查询参数配置.
//     *
//     * @param queryVo              查询对象实体
//     * @return page
//     */
//    @GetMapping("/page")
//    @ApiOperation(value = "分页查询参数配置", notes = "分页查询参数配置", produces = "application/json")
//    public Result<PageInfo<SysConfigPageDto>, Object> page(@ApiParam("查询参数") SysConfigQueryVo queryVo) {
//
//        PageInfo<SysConfigPageDto> pageInfo = this.sysConfigService.queryPageByWrapper(queryVo);
//        return Result.success(pageInfo);
//    }

    /**
     * 新增参数配置.
     *
     * @param addVo     新增参数配置参数
     * @return          新增成功
     */
    @ApiOperation(value = "新增参数配置", notes = "新增参数配置", produces = "application/json")
    @PostMapping("/add")
    public ResultObj add(@ApiParam("新增参数") @Valid @RequestBody SysConfigAddVo addVo) {

        this.sysConfigService.insert(addVo);
        return ResultObj.ok("新增参数配置成功");
    }

    /**
     * 修改参数配置.
     *
     * @param updateVo  参数配置参数
     * @return string   修改是否成功提示信息
     */
    @PutMapping("/update")
    @ApiOperation(value = "修改参数配置", notes = "修改参数配置", produces = "application/json")
    public ResultObj update(@ApiParam("修改参数") @Valid @RequestBody SysConfigUptVo updateVo) {

        this.sysConfigService.update(updateVo);
        return ResultObj.ok("修改参数配置成功");
    }

    /**
     * 批量删除参数配置.
     *
     * @param pks 主键
     * @return 删除成功
     */
    @DeleteMapping("/batchDel/{pks}")
    @ApiOperation(value = "根据参数配置主键批量删除数据", notes = "根据参数配置主键批量删除数据", produces = "application/json")
    public ResultObj batchDel(@ApiParam("主键") @PathVariable(value = "pks") Set<Integer> pks) {

        // 通过主键批量删除数据
        this.sysConfigService.batchDel(pks);
        return ResultObj.ok("批量删除成功");
    }

    /**
    * 查看参数配置.
    *
    * @param id 主键
    * @return 详情信息
    */
    @GetMapping("/{id}")
    @ApiOperation(value = "根据id主键查看数据", notes = "根据id主键查看数据", produces = "application/json")
    public ResultObj getDetail(@PathVariable(value = "id") Integer id) {

        // 通过主键查看数据
        SysConfigDto dto = this.sysConfigService.getDetail(id);
        return ResultObj.ok().setData(dto);
    }

}
