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
import com.atqgh.vo.SysDictDataAddVo;
import com.atqgh.vo.SysDictDataUptVo;
import com.atqgh.dto.SysDictDataDto;
import com.atqgh.service.SysDictDataService;
import java.util.Set;

/**
 * 字典数据.
 *
 * @author Mubai
 * @date 2022-07-11 21:54:00
 */
@Api(tags = "字典数据")
@RestController
@RequestMapping("/sysDictData")
public class SysDictDataController {

    @Resource
    private SysDictDataService sysDictDataService;

    /**
     * 新增字典数据.
     *
     * @param addVo     新增字典数据参数
     * @return          新增成功
     */
    @ApiOperation(value = "新增字典数据", notes = "新增字典数据", produces = "application/json")
    @PostMapping("/add")
    public ResultObj add(@ApiParam("新增参数") @Valid @RequestBody SysDictDataAddVo addVo) {

        this.sysDictDataService.insert(addVo);
        return ResultObj.ok("新增字典数据成功");
    }

    /**
     * 修改字典数据.
     *
     * @param updateVo  字典数据参数
     * @return string   修改是否成功提示信息
     */
    @PutMapping("/update")
    @ApiOperation(value = "修改字典数据", notes = "修改字典数据", produces = "application/json")
    public ResultObj update(@ApiParam("修改参数") @Valid @RequestBody SysDictDataUptVo updateVo) {

        this.sysDictDataService.update(updateVo);
        return ResultObj.ok("修改字典数据成功");
    }

    /**
     * 批量删除字典数据.
     *
     * @param pks 主键
     * @return 删除成功
     */
    @DeleteMapping("/batchDel/{pks}")
    @ApiOperation(value = "根据字典数据主键批量删除数据", notes = "根据字典数据主键批量删除数据", produces = "application/json")
    public ResultObj batchDel(@ApiParam("主键") @PathVariable(value = "pks") Set<Long> pks) {

        // 通过主键批量删除数据
        this.sysDictDataService.batchDel(pks);
        return ResultObj.ok("批量删除成功");
    }

    /**
    * 查看字典数据.
    *
    * @param dictCode 主键
    * @return 详情信息
    */
    @GetMapping("/{dictCode}")
    @ApiOperation(value = "根据dictCode主键查看数据", notes = "根据dictCode主键查看数据", produces = "application/json")
    public ResultObj getDetail(@PathVariable(value = "dictCode") Long dictCode) {

        // 通过主键查看数据
        SysDictDataDto dto = this.sysDictDataService.getDetail(dictCode);
        return ResultObj.ok().setData(dto);
    }

}
