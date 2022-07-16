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
import com.atqgh.vo.SysJobQueryVo;
import com.atqgh.vo.SysJobAddVo;
import com.atqgh.vo.SysJobUptVo;
import com.atqgh.dto.SysJobDto;
import com.atqgh.dto.SysJobPageDto;
import com.atqgh.service.SysJobService;
import java.util.Set;

/**
 * 定时任务调度.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
@Api(tags = "定时任务调度")
@RestController
@RequestMapping("/sysJob")
public class SysJobController {

    @Resource
    private SysJobService sysJobService;

    /**
     * 新增定时任务调度.
     *
     * @param addVo     新增定时任务调度参数
     * @return          新增成功
     */
    @ApiOperation(value = "新增定时任务调度", notes = "新增定时任务调度", produces = "application/json")
    @PostMapping("/add")
    public ResultObj add(@ApiParam("新增参数") @Valid @RequestBody SysJobAddVo addVo) {

        this.sysJobService.insert(addVo);
        return ResultObj.ok("新增定时任务调度成功");
    }

    /**
     * 修改定时任务调度.
     *
     * @param updateVo  定时任务调度参数
     * @return string   修改是否成功提示信息
     */
    @PutMapping("/update")
    @ApiOperation(value = "修改定时任务调度", notes = "修改定时任务调度", produces = "application/json")
    public ResultObj update(@ApiParam("修改参数") @Valid @RequestBody SysJobUptVo updateVo) {

        this.sysJobService.update(updateVo);
        return ResultObj.ok("修改定时任务调度成功");
    }

    /**
     * 批量删除定时任务调度.
     *
     * @param pks 主键
     * @return 删除成功
     */
    @DeleteMapping("/batchDel/{pks}")
    @ApiOperation(value = "根据定时任务调度主键批量删除数据", notes = "根据定时任务调度主键批量删除数据", produces = "application/json")
    public ResultObj batchDel(@ApiParam("主键") @PathVariable(value = "pks") Set<Long> pks) {

        // 通过主键批量删除数据
        this.sysJobService.batchDel(pks);
        return ResultObj.ok("批量删除成功");
    }

    /**
    * 查看定时任务调度.
    *
    * @param jobId 主键
    * @return 详情信息
    */
    @GetMapping("/{jobId}")
    @ApiOperation(value = "根据jobId主键查看数据", notes = "根据jobId主键查看数据", produces = "application/json")
    public ResultObj getDetail(@PathVariable(value = "jobId") Long jobId) {

        // 通过主键查看数据
        SysJobDto dto = this.sysJobService.getDetail(jobId);
        return ResultObj.ok().setData(dto);
    }

}
