package com.abing.blog.controller;

import com.abing.blog.entity.Type;
import com.abing.blog.pojo.Result;
import com.abing.blog.pojo.ResultCode;
import com.abing.blog.service.TypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description: TypeController
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2020/01/02 19:19
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/type")
@Slf4j
@Api(description = "类型")
public class TypeController {
    @Autowired
    private TypeService typeService;

    @ApiOperation("获取所有分类")
    @ApiResponses({@ApiResponse(code = ResultCode.OK, message = "请求成功"),
            @ApiResponse(code = ResultCode.NOT_FIND_RESOURCE, message = "暂无博客")})
    @GetMapping("/get")
    public Result<List<Type>> getAllTypes() {
        Result<List<Type>> result = new Result<>();
        try {
            List<Type> types = typeService.listTypes();
            result.setData(types);
        } catch (Exception e) {
            result.setError(ResultCode.NOT_FIND_RESOURCE, e.getMessage());
        }
        return result;
    }
}
