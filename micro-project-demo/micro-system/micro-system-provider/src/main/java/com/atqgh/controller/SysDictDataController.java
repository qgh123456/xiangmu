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
import com.atqgh.vo.SysDictDataQueryVo;
import com.atqgh.vo.SysDictDataAddVo;
import com.atqgh.vo.SysDictDataUptVo;
import com.atqgh.dto.SysDictDataDto;
import com.atqgh.dto.SysDictDataPageDto;
import com.atqgh.service.SysDictDataService;
import java.util.Set;

/**
 * 字典数据.
 *
 * @author Mubai
 * @date 2022-07-03 15:31:09
 */
@Api(tags = "字典数据")
@RestController
@RequestMapping("/sysDictData")
public class SysDictDataController {

    @Resource
    private SysDictDataService sysDictDataService;

    /**
     * 分页查询字典数据.
     *
     * @param queryVo              查询对象实体
     * @return page
     */
//    @GetMapping("/page")
//    @ApiOperation(value = "分页查询字典数据", notes = "分页查询字典数据", produces = "application/json")
//    public Result<PageInfo<SysDictDataPageDto>, Object> page(@ApiParam("查询参数") SysDictDataQueryVo queryVo) {
//
//        PageInfo<SysDictDataPageDto> pageInfo = this.sysDictDataService.queryPageByWrapper(queryVo);
//        return Result.success(pageInfo);
//    }

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
    * @param code 主键
    * @return 详情信息
    */
    @GetMapping("/{code}")
    @ApiOperation(value = "根据code主键查看数据", notes = "根据code主键查看数据", produces = "application/json")
    public ResultObj getDetail(@PathVariable(value = "code") Long code) {

        // 通过主键查看数据
        SysDictDataDto dto = this.sysDictDataService.getDetail(code);
        return ResultObj.ok().setData(dto);
    }

}
