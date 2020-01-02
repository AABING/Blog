package com.abing.blog.service;

import com.abing.blog.entity.Blog;
import com.abing.blog.pojo.BlogPojo;
import com.abing.blog.pojo.SimpleBlogPojo;

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

    /**
     * description: 获取所有推荐博客
     *
     * @return java.util.List<com.abing.blog.pojo.SimpleBlogPojo>
     * @author LiBingxiang
     * @date 2020/01/02 14:41:52
     */
    List<SimpleBlogPojo> listRecommendBlogs() throws Exception;

    /**
     * description: 根据分类获取博客
     *
     * @return java.util.List<com.abing.blog.pojo.SimpleBlogPojo>
     * @author LiBingxiang
     * @date 2020/01/02 19:24:40
     */
    List<SimpleBlogPojo> listBlogsByType(String id) throws Exception;

    /**
     * description: 获取用户收藏的博客
     *
     * @param uid 用户id
     * @return java.util.List<com.abing.blog.pojo.SimpleBlogPojo>
     * @author LiBingxiang
     * @date 2020/01/02 20:39:15
     */
    List<SimpleBlogPojo> listCollectBlogs(String uid) throws Exception;

    /**
     * description: 收藏博客
     *
     * @param blogId  博客id
     * @param uid 用户id
     * @return java.lang.String
     * @author LiBingxiang
     * @date 2020/01/02 21:10:37
     */
    String collectBlog(String blogId, String uid) throws Exception;

    /**
     * description: 收藏博客
     *
     * @param blogId 博客id
     * @param uid 用户id
     * @return java.lang.String
     * @author LiBingxiang
     * @date 2020/01/02 21:18:52
     */
    String cancelCollectBlog(String blogId, String uid) throws Exception;

    /**
     * description: 搜索博客
     *
     * @param title 博客标题
     * @return java.util.List<com.abing.blog.pojo.SimpleBlogPojo>
     * @author LiBingxiang
     * @date 2020/01/02 21:31:12
     */
    List<SimpleBlogPojo> searchBlog(String title);
}
