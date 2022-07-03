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
import com.atqgh.vo.SysNoticeQueryVo;
import com.atqgh.vo.SysNoticeAddVo;
import com.atqgh.vo.SysNoticeUptVo;
import com.atqgh.dto.SysNoticeDto;
import com.atqgh.dto.SysNoticePageDto;
import com.atqgh.service.SysNoticeService;
import java.util.Set;

/**
 * 通知公告.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:08
 */
@Api(tags = "通知公告")
@RestController
@RequestMapping("/sysNotice")
public class SysNoticeController {

    @Resource
    private SysNoticeService sysNoticeService;

    /**
     * 分页查询通知公告.
     *
     * @param queryVo              查询对象实体
     * @return page
     */
//    @GetMapping("/page")
//    @ApiOperation(value = "分页查询通知公告", notes = "分页查询通知公告", produces = "application/json")
//    public Result<PageInfo<SysNoticePageDto>, Object> page(@ApiParam("查询参数") SysNoticeQueryVo queryVo) {
//
//        PageInfo<SysNoticePageDto> pageInfo = this.sysNoticeService.queryPageByWrapper(queryVo);
//        return Result.success(pageInfo);
//    }

    /**
     * 新增通知公告.
     *
     * @param addVo     新增通知公告参数
     * @return          新增成功
     */
    @ApiOperation(value = "新增通知公告", notes = "新增通知公告", produces = "application/json")
    @PostMapping("/add")
    public ResultObj add(@ApiParam("新增参数") @Valid @RequestBody SysNoticeAddVo addVo) {

        this.sysNoticeService.insert(addVo);
        return ResultObj.ok("新增通知公告成功");
    }

    /**
     * 修改通知公告.
     *
     * @param updateVo  通知公告参数
     * @return string   修改是否成功提示信息
     */
    @PutMapping("/update")
    @ApiOperation(value = "修改通知公告", notes = "修改通知公告", produces = "application/json")
    public ResultObj update(@ApiParam("修改参数") @Valid @RequestBody SysNoticeUptVo updateVo) {

        this.sysNoticeService.update(updateVo);
        return ResultObj.ok("修改通知公告成功");
    }

    /**
     * 批量删除通知公告.
     *
     * @param pks 主键
     * @return 删除成功
     */
    @DeleteMapping("/batchDel/{pks}")
    @ApiOperation(value = "根据通知公告主键批量删除数据", notes = "根据通知公告主键批量删除数据", produces = "application/json")
    public ResultObj batchDel(@ApiParam("主键") @PathVariable(value = "pks") Set<Integer> pks) {

        // 通过主键批量删除数据
        this.sysNoticeService.batchDel(pks);
        return ResultObj.ok("批量删除成功");
    }

    /**
    * 查看通知公告.
    *
    * @param id 主键
    * @return 详情信息
    */
    @GetMapping("/{id}")
    @ApiOperation(value = "根据id主键查看数据", notes = "根据id主键查看数据", produces = "application/json")
    public ResultObj getDetail(@PathVariable(value = "id") Integer id) {

        // 通过主键查看数据
        SysNoticeDto dto = this.sysNoticeService.getDetail(id);
        return ResultObj.ok().setData(dto);
    }

}
