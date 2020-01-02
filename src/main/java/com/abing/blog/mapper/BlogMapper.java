package com.abing.blog.mapper;

import com.abing.blog.baseDao.MyMapper;
import com.abing.blog.entity.Blog;
import com.abing.blog.pojo.BlogPojo;
import org.springframework.security.core.Transient;

import java.util.List;

/**
 * Description: BlogMapper
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/13 15:53
 * @since JDK 1.8
 */
@Transient
public interface BlogMapper extends MyMapper<Blog> {

    /**
     * description: 获取全部博客
     *
     * @return java.util.List<com.abing.blog.entity.Blog>
     * @author LiBingxiang
     * @date 2019/12/15 14:50:39
     */
    List<BlogPojo> listBlogs();

    /**
     * description: 根据博客id查找博客
     *
     * @param id    博客id
     * @return com.abing.blog.entity.Blog
     * @author LiBingxiang
     * @date 2019/12/15 14:50:59
     */
    BlogPojo getBlogById(String id);

    /**
     * description: 根据用户id获取博客
     *
     * @param uid	 用户id
     * @return java.util.List<com.abing.blog.entity.Blog>
     * @author LiBingxiang
     * @date 2019/12/15 14:52:19
     */
    List<BlogPojo> listBlogsByUserId(String uid);

    Integer saveBlog(Blog blog);
}
