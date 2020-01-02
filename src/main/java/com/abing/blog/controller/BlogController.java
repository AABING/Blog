package com.abing.blog.controller;

import com.abing.blog.entity.Blog;
import com.abing.blog.pojo.BlogPojo;
import com.abing.blog.pojo.Result;
import com.abing.blog.pojo.ResultCode;
import com.abing.blog.service.BlogService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description: BlogController
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/13 15:23
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/blog")
@Slf4j
@Api(description = "博客")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @ApiOperation("获取所有博客")
    @ApiResponses({@ApiResponse(code = ResultCode.OK, message = "请求成功"),
            @ApiResponse(code = ResultCode.NOT_FIND_RESOURCE, message = "暂无博客")})
    @GetMapping("/get")
    public Result<List<BlogPojo>> getAllBlogs() {
        Result<List<BlogPojo>> result = new Result<>();
        try {
            List<BlogPojo> blogs = blogService.listBlogs();
            result.setData(blogs);
        } catch (Exception e) {
            result.setError(ResultCode.NOT_FIND_RESOURCE, e.getMessage());
        }
        return result;
    }

    @ApiOperation("根据博客id获取博客")
    @ApiResponses({@ApiResponse(code = ResultCode.OK, message = "请求成功"),
            @ApiResponse(code = ResultCode.NOT_FIND_RESOURCE, message = "该博客不存在")})
    @ApiImplicitParams({@ApiImplicitParam(paramType = "path", dataType = "String", name = "id", value = "博客id", required = true)})
    @GetMapping("/get/{id}")
    public Result<BlogPojo> getBlog(@PathVariable String id) {
        Result<BlogPojo> result = new Result<>();
        try {
            BlogPojo blog = blogService.getBlogById(id);
            result.setData(blog);
        } catch (Exception e) {
            result.setError(ResultCode.NOT_FIND_RESOURCE, e.getMessage());
        }
        return result;
    }

    @ApiOperation("根据用户id获取用户的所有博客")
    @ApiResponses({@ApiResponse(code = ResultCode.OK, message = "请求成功"),
            @ApiResponse(code = ResultCode.NOT_FIND_RESOURCE, message = "该用户不存在/暂无博客")})
    @ApiImplicitParams({@ApiImplicitParam(paramType = "path", dataType = "String", name = "uid", value = "用户id", required = true)})
    @GetMapping("/get/user/{uid}")
    public Result<List<BlogPojo>> getBlogsByUserId(@PathVariable String uid) {
        Result<List<BlogPojo>> result = new Result<>();
        try {
            List<BlogPojo> blogs = blogService.listBlogsByUserId(uid);
            result.setData(blogs);
        } catch (Exception e) {
            result.setError(ResultCode.NOT_FIND_RESOURCE, e.getMessage());
        }
        return result;
    }

    @ApiOperation("新增博客")
    @ApiResponses({@ApiResponse(code = ResultCode.OK, message = "请求成功"),
            @ApiResponse(code = ResultCode.ERROR, message = "新增博客失败")})
    @ApiImplicitParams({@ApiImplicitParam(paramType = "query", dataType = "String", name = "title", value = "博客标题", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "createTime", value = "创建时间", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "typeId", value = "类型id", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "userId", value = "用户id", required = true)})
    @PostMapping("/insert")
    public Result<String> addBlog(Blog blog) {
        Result<String> result = new Result<>();
        try {
            String s = blogService.saveBlog(blog);
            result.setData(s);
        } catch (Exception e) {
            result.setError(ResultCode.ERROR, e.getMessage());
        }
        return result;
    }

    @PutMapping("/update")
    public Result<String> updateBlog(Blog blog) {
        Result<String> result = new Result<>();
        try {
            blogService.updateBlog(blog);
            result.setData("更新博客成功");
        } catch (Exception e) {
            result.setError(ResultCode.ERROR, e.getMessage());
        }
        return result;
    }

    @DeleteMapping("/remove/{id}")
    public Result<String> removeBlog(@PathVariable String id) {
        Result<String> result = new Result<>();
        try {
            blogService.removeBlog(id);
            result.setData("删除博客成功");
        } catch (Exception e) {
            result.setError(ResultCode.ERROR, e.getMessage());
        }
        return result;
    }
}
