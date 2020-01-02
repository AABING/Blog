package com.abing.blog.service.impl;

import com.abing.blog.entity.Blog;
import com.abing.blog.entity.User;
import com.abing.blog.mapper.BlogMapper;
import com.abing.blog.mapper.UserMapper;
import com.abing.blog.pojo.BlogPojo;
import com.abing.blog.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: BlogService
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/13 15:50
 * @since JDK 1.8
 */
@Service
@Slf4j
public class BlogServiceImpl implements BlogService {
    @Resource
    private BlogMapper blogMapper;
    @Resource
    private UserMapper userMapper;

    @Override
    public List<BlogPojo> listBlogs() throws Exception {
        List<BlogPojo> blogs = blogMapper.listBlogs();
        if (blogs == null) {
            throw new Exception("暂无博客");
        }
        return blogs;
    }

    @Override
    public BlogPojo getBlogById(String id) throws Exception {
        BlogPojo blog = blogMapper.getBlogById(id);
        if (blog == null) {
            throw new Exception("该博客不存在");
        }
        return blog;
    }

    @Override
    public List<BlogPojo> listBlogsByUserId(String uid) throws Exception {
        User user = userMapper.selectByPrimaryKey(uid);
        if (user == null) {
            throw new Exception("该用户不存在");
        }
        List<BlogPojo> blogs = blogMapper.listBlogsByUserId(uid);
        if (blogs == null) {
            throw new Exception("暂无博客");
        }
        return blogs;
    }

    @Override
    public String saveBlog(Blog blog) throws Exception {
        int result = blogMapper.saveBlog(blog);
        if (result != 1) {
            throw new Exception("新增博客失败");
        }
        return "新增博客成功";
    }

    @Override
    public String updateBlog(Blog blog) throws Exception {
        int result = blogMapper.updateByPrimaryKey(blog);
        if (result != 1) {
            throw new Exception("修改博客失败");
        }
        return "修改博客成功";
    }

    @Override
    public String removeBlog(String id) throws Exception {
        int result = blogMapper.deleteByPrimaryKey(id);
        if (result != 1) {
            throw new Exception("删除博客失败");
        }
        return "删除博客成功";
    }
}
