package com.abing.blog.service;

import com.abing.blog.entity.Blog;
import com.abing.blog.pojo.BlogPojo;

import java.util.List;

/**
 * Description: BlogService
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/13 15:50
 * @since JDK 1.8
 */
public interface BlogService {
    /**
     * description: 获取全部博客
     *
     * @return java.util.List<com.abing.blog.entity.Blog>
     * @author LiBingxiang
     * @date 2019/12/15 13:33:07
     */
    List<BlogPojo> listBlogs() throws Exception;

    /**
     * description: 根据博客id获取博客
     *
     * @param id 博客id
     * @return com.abing.blog.entity.Blog
     * @author LiBingxiang
     * @date 2019/12/15 13:32:43
     */
    BlogPojo getBlogById(String id) throws Exception;

    /**
     * description: 根据用户id获取该用户所有的博客
     *
     * @param uid 用户id
     * @return java.util.List<com.abing.blog.entity.Blog>
     * @author LiBingxiang
     * @date 2019/12/15 13:35:01
     */
    List<BlogPojo> listBlogsByUserId(String uid) throws Exception;

    /**
     * description: 新增博客
     *
     * @param blog 博客信息
     * @return com.abing.blog.entity.Blog
     * @author LiBingxiang
     * @date 2019/12/15 16:30:53
     */
    String saveBlog(Blog blog) throws Exception;

    /**
     * description: 修改博客
     *
     * @param blog　博客信息
     * @return java.lang.String
     * @author LiBingxiang
     * @date 2020/01/01 22:40:14
     */
    String updateBlog(Blog blog) throws Exception;

    /**
     * description: 删除博客
     *
     * @param id 博客id
     * @return java.lang.String
     * @author LiBingxiang
     * @date 2020/01/02 12:52:52
     */
    String removeBlog(String id) throws Exception;
}
