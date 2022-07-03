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
import com.atqgh.vo.SysJobLogQueryVo;
import com.atqgh.vo.SysJobLogAddVo;
import com.atqgh.vo.SysJobLogUptVo;
import com.atqgh.dto.SysJobLogDto;
import com.atqgh.dto.SysJobLogPageDto;
import com.atqgh.service.SysJobLogService;
import java.util.Set;

/**
 * 定时任务调度日志.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:08
 */
@Api(tags = "定时任务调度日志")
@RestController
@RequestMapping("/sysJobLog")
public class SysJobLogController {

    @Resource
    private SysJobLogService sysJobLogService;

    /**
     * 分页查询定时任务调度日志.
     *
     * @param queryVo              查询对象实体
     * @return page
     */
//    @GetMapping("/page")
//    @ApiOperation(value = "分页查询定时任务调度日志", notes = "分页查询定时任务调度日志", produces = "application/json")
//    public Result<PageInfo<SysJobLogPageDto>, Object> page(@ApiParam("查询参数") SysJobLogQueryVo queryVo) {
//
//        PageInfo<SysJobLogPageDto> pageInfo = this.sysJobLogService.queryPageByWrapper(queryVo);
//        return Result.success(pageInfo);
//    }

    /**
     * 新增定时任务调度日志.
     *
     * @param addVo     新增定时任务调度日志参数
     * @return          新增成功
     */
    @ApiOperation(value = "新增定时任务调度日志", notes = "新增定时任务调度日志", produces = "application/json")
    @PostMapping("/add")
    public ResultObj add(@ApiParam("新增参数") @Valid @RequestBody SysJobLogAddVo addVo) {

        this.sysJobLogService.insert(addVo);
        return ResultObj.ok("新增定时任务调度日志成功");
    }

    /**
     * 修改定时任务调度日志.
     *
     * @param updateVo  定时任务调度日志参数
     * @return string   修改是否成功提示信息
     */
    @PutMapping("/update")
    @ApiOperation(value = "修改定时任务调度日志", notes = "修改定时任务调度日志", produces = "application/json")
    public ResultObj update(@ApiParam("修改参数") @Valid @RequestBody SysJobLogUptVo updateVo) {

        this.sysJobLogService.update(updateVo);
        return ResultObj.ok("修改定时任务调度日志成功");
    }

    /**
     * 批量删除定时任务调度日志.
     *
     * @param pks 主键
     * @return 删除成功
     */
    @DeleteMapping("/batchDel/{pks}")
    @ApiOperation(value = "根据定时任务调度日志主键批量删除数据", notes = "根据定时任务调度日志主键批量删除数据", produces = "application/json")
    public ResultObj batchDel(@ApiParam("主键") @PathVariable(value = "pks") Set<Long> pks) {

        // 通过主键批量删除数据
        this.sysJobLogService.batchDel(pks);
        return ResultObj.ok("批量删除成功");
    }

    /**
    * 查看定时任务调度日志.
    *
    * @param id 主键
    * @return 详情信息
    */
    @GetMapping("/{id}")
    @ApiOperation(value = "根据id主键查看数据", notes = "根据id主键查看数据", produces = "application/json")
    public ResultObj getDetail(@PathVariable(value = "id") Long id) {

        // 通过主键查看数据
        SysJobLogDto dto = this.sysJobLogService.getDetail(id);
        return ResultObj.ok().setData(dto);
    }

}
