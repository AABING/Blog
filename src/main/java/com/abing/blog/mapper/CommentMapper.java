package com.abing.blog.mapper;

import com.abing.blog.baseDao.MyMapper;
import com.abing.blog.entity.Comment;
import org.springframework.security.core.Transient;

import java.util.List;

/**
 * Description: CommentMapper
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/14 22:49
 * @since JDK 1.8
 */
@Transient
public interface CommentMapper extends MyMapper<Comment> {

    /**
     * description: 根据博客id获取所有评论
     *
     * @param blogId 博客id
     * @return java.util.List<com.abing.blog.entity.Comment>
     * @author LiBingxiang
     * @date 2020/01/02 19:47:42
     */
    List<Comment> listCommentsByBlogId(Integer blogId);

    /**
     * description: 获取子评论
     *
     * @param pid 父评论id
     * @return java.util.List<com.abing.blog.entity.Comment>
     * @author LiBingxiang
     * @date 2020/01/02 19:48:32
     */
    List<Comment> listCommentsByPid(Integer pid);

    /**
     * description: 获取父评论
     *
     * @param pid 父评论id
     * @return com.abing.blog.entity.Comment
     * @author LiBingxiang
     * @date 2020/01/02 19:48:43
     */
    Comment getCommentByPid(Integer pid);
}
