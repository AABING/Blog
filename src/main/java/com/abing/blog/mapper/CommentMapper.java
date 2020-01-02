package com.abing.blog.mapper;

import com.abing.blog.baseDao.MyMapper;
import com.abing.blog.entity.Comment;

import java.util.List;

/**
 * Description: CommentMapper
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/14 22:49
 * @since JDK 1.8
 */
public interface CommentMapper extends MyMapper<Comment> {

    List<Comment> listCommentsByBlogId(Integer blogId);

    List<Comment> listCommentsByPid(Integer pid);

    Comment getCommentByPid(Integer pid);
}
