package com.abing.blog.controller;

import com.abing.blog.entity.Blog;
import com.abing.blog.pojo.BlogPojo;
import com.abing.blog.pojo.SimpleBlogPojo;
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
    @GetMapping("/get/{blogId}/{uid}")
    public Result<BlogPojo> getBlog(@PathVariable String blogId, @PathVariable String uid) {
        Result<BlogPojo> result = new Result<>();
        try {
            BlogPojo blog = blogService.getBlogById(blogId, uid);
            result.setData(blog);
        } catch (Exception e) {
            result.setError(ResultCode.NOT_FIND_RESOURCE, e.getMessage());
        }
        return result;
    }

    @ApiOperation("获取所有推荐博客")
    @ApiResponses({@ApiResponse(code = ResultCode.OK, message = "请求成功"),
            @ApiResponse(code = ResultCode.NOT_FIND_RESOURCE, message = "暂无博客")})
    @GetMapping("/get/recommend")
    public Result<List<SimpleBlogPojo>> getRecommendBlogs() {
        Result<List<SimpleBlogPojo>> result = new Result<>();
        try {
            List<SimpleBlogPojo> blogs = blogService.listRecommendBlogs();
            result.setData(blogs);
        } catch (Exception e) {
            result.setError(ResultCode.NOT_FIND_RESOURCE, e.getMessage());
        }
        return result;
    }

    @ApiOperation("根据分类获取博客")
    @ApiResponses({@ApiResponse(code = ResultCode.OK, message = "请求成功"),
            @ApiResponse(code = ResultCode.NOT_FIND_RESOURCE, message = "暂无博客")})
    @GetMapping("/get/type/{id}")
    public Result<List<SimpleBlogPojo>> getBlogsByType(@PathVariable("id") String id) {
        Result<List<SimpleBlogPojo>> result = new Result<>();
        try {
            List<SimpleBlogPojo> blogs = blogService.listBlogsByType(id);
            result.setData(blogs);
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

    @ApiOperation("获取用户收藏的所有博客")
    @ApiResponses({@ApiResponse(code = ResultCode.OK, message = "请求成功"),
            @ApiResponse(code = ResultCode.NOT_FIND_RESOURCE, message = "该用户不存在/暂无博客")})
    @ApiImplicitParams({@ApiImplicitParam(paramType = "path", dataType = "String", name = "uid", value = "用户id", required = true)})
    @GetMapping("/get/user/{uid}/collection")
    public Result<List<SimpleBlogPojo>> getCollectBlogs(@PathVariable String uid) {
        Result<List<SimpleBlogPojo>> result = new Result<>();
        try {
            List<SimpleBlogPojo> blogs = blogService.listCollectBlogs(uid);
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

    @ApiOperation("收藏博客")
    @GetMapping("/insert/{uid}/{blogId}")
    public Result<String> collectBlog(@PathVariable String uid, @PathVariable String blogId) {
        Result<String> result = new Result<>();
        try {
            String s = blogService.collectBlog(blogId, uid);
            result.setData(s);
        } catch (Exception e) {
            result.setError(ResultCode.ERROR, e.getMessage());
        }
        return result;
    }

    @ApiOperation("取消收藏博客")
    @GetMapping("/remove/{uid}/{blogId}")
    public Result<String> cancelCollectBlog(@PathVariable String uid, @PathVariable String blogId) {
        Result<String> result = new Result<>();
        try {
            String s = blogService.cancelCollectBlog(blogId, uid);
            result.setData(s);
        } catch (Exception e) {
            result.setError(ResultCode.ERROR, e.getMessage());
        }
        return result;
    }

    @ApiOperation("修改博客")
    @PutMapping("/update")
    public Result<String> updateBlog(Blog blog) {
        Result<String> result = new Result<>();
        try {
            String s = blogService.updateBlog(blog);
            result.setData(s);
        } catch (Exception e) {
            result.setError(ResultCode.ERROR, e.getMessage());
        }
        return result;
    }

    @ApiOperation("删除博客")
    @DeleteMapping("/remove/{id}")
    public Result<String> removeBlog(@PathVariable String id) {
        Result<String> result = new Result<>();
        try {
            String s = blogService.removeBlog(id);
            result.setData(s);
        } catch (Exception e) {
            result.setError(ResultCode.ERROR, e.getMessage());
        }
        return result;
    }

    @ApiOperation("搜索博客")
    @GetMapping("/search")
    public Result<List<SimpleBlogPojo>> searchBlog(@RequestParam(value = "title", required = false) String title) {
        Result<List<SimpleBlogPojo>> result = new Result<>();
        if (title == null || "".equals(title)) {
            return result;
        }
        try {
            List<SimpleBlogPojo> blogs = blogService.searchBlog(title);
            result.setData(blogs);
        } catch (Exception e) {
            result.setError(ResultCode.NOT_FIND_RESOURCE, e.getMessage());
        }
        return result;
    }
}