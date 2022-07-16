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
import com.atqgh.vo.GenTableColumnAddVo;
import com.atqgh.vo.GenTableColumnUptVo;
import com.atqgh.dto.GenTableColumnDto;
import com.atqgh.service.GenTableColumnService;
import java.util.Set;

/**
 * 代码生成业务表字.
 *
 * @author Mubai
 * @date 2022-07-11 21:53:59
 */
@Api(tags = "代码生成业务表字")
@RestController
@RequestMapping("/genTableColumn")
public class GenTableColumnController {

    @Resource
    private GenTableColumnService genTableColumnService;

    /**
     * 新增代码生成业务表字.
     *
     * @param addVo     新增代码生成业务表字参数
     * @return          新增成功
     */
    @ApiOperation(value = "新增代码生成业务表字", notes = "新增代码生成业务表字", produces = "application/json")
    @PostMapping("/add")
    public ResultObj add(@ApiParam("新增参数") @Valid @RequestBody GenTableColumnAddVo addVo) {

        this.genTableColumnService.insert(addVo);
        return ResultObj.ok("新增代码生成业务表字成功");
    }

    /**
     * 修改代码生成业务表字.
     *
     * @param updateVo  代码生成业务表字参数
     * @return string   修改是否成功提示信息
     */
    @PutMapping("/update")
    @ApiOperation(value = "修改代码生成业务表字", notes = "修改代码生成业务表字", produces = "application/json")
    public ResultObj update(@ApiParam("修改参数") @Valid @RequestBody GenTableColumnUptVo updateVo) {

        this.genTableColumnService.update(updateVo);
        return ResultObj.ok("修改代码生成业务表字成功");
    }

    /**
     * 批量删除代码生成业务表字.
     *
     * @param pks 主键
     * @return 删除成功
     */
    @DeleteMapping("/batchDel/{pks}")
    @ApiOperation(value = "根据代码生成业务表字主键批量删除数据", notes = "根据代码生成业务表字主键批量删除数据", produces = "application/json")
    public ResultObj batchDel(@ApiParam("主键") @PathVariable(value = "pks") Set<Long> pks) {

        // 通过主键批量删除数据
        this.genTableColumnService.batchDel(pks);
        return ResultObj.ok("批量删除成功");
    }

    /**
    * 查看代码生成业务表字.
    *
    * @param columnId 主键
    * @return 详情信息
    */
    @GetMapping("/{columnId}")
    @ApiOperation(value = "根据columnId主键查看数据", notes = "根据columnId主键查看数据", produces = "application/json")
    public ResultObj getDetail(@PathVariable(value = "columnId") Long columnId) {

        // 通过主键查看数据
        GenTableColumnDto dto = this.genTableColumnService.getDetail(columnId);
        return ResultObj.ok().setData(dto);
    }

}
