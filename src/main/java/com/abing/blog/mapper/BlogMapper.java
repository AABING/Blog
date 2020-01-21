package com.abing.blog.mapper;

import com.abing.blog.baseDao.MyMapper;
import com.abing.blog.entity.Blog;
import com.abing.blog.pojo.BlogPojo;
import com.abing.blog.pojo.SimpleBlogPojo;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.Transient;

import java.util.List;
import java.util.Map;

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

    /**
     * description: 新增博客
     *
     * @param blog 博客信息
     * @return java.lang.Integer
     * @author LiBingxiang
     * @date 2020/01/02 19:43:35
     */
    Integer saveBlog(Blog blog);

    /**
     * description: 获取所有推荐博客
     *
     * @return java.util.List<com.abing.blog.pojo.SimpleBlogPojo>
     * @author LiBingxiang
     * @date 2020/01/02 19:44:10
     */
    List<SimpleBlogPojo> listRecommendBlogs();

    /**
     * description: 更新浏览量
     *
     * @param id 博客id
     * @param views 浏览量
     * @return void
     * @author LiBingxiang
     * @date 2020/01/02 19:44:27
     */
    void updateViewsById(@Param("id") String id, @Param("views") Integer views);

    /**
     * description: 根据分类获取博客
     *
     * @param id 分类id
     * @return java.util.List<com.abing.blog.pojo.SimpleBlogPojo>
     * @author LiBingxiang
     * @date 2020/01/02 19:46:29
     */
    List<SimpleBlogPojo> listBlogsByType(String id);

    /**
     * description: 获取用户收藏的博客
     *
     * @param uid 用户id
     * @return java.util.List<com.abing.blog.pojo.SimpleBlogPojo>
     * @author LiBingxiang
     * @date 2020/01/02 20:39:02
     */
    List<SimpleBlogPojo> listCollectBlogs(String uid);

    /**
     * description: 收藏博客
     *
     * @param blogId 博客id
     * @param uid 用户id
     * @return java.lang.Integer
     * @author LiBingxiang
     * @date 2020/01/02 21:13:17
     */
    Integer saveCollectBlog(@Param("blogId") String blogId, @Param("uid") String uid);

    /**
     * description: 取消收藏博客
     *
     * @param blogId 博客id
     * @param uid 用户id
     * @return java.lang.Integer
     * @author LiBingxiang
     * @date 2020/01/02 21:21:18
     */
    Integer removeCollectBlog(@Param("blogId") String blogId, @Param("uid") String uid);

    /**
     * description: 搜索博客
     *
     * @param title 博客标题
     * @return java.util.List<com.abing.blog.pojo.SimpleBlogPojo>
     * @author LiBingxiang
     * @date 2020/01/02 21:37:03
     */
    List<SimpleBlogPojo> searchBlog(String title);

    /**
     * description: 查询博客收藏情况
     *
     * @param blogId 博客id
     * @param uid 用户id
     * @return java.lang.Integer
     * @author LiBingxiang
     * @date 2020/01/03 13:45:38
     */
    Map<Integer,Integer> getCollection(@Param("blogId") String blogId, @Param("uid") String uid);
}
