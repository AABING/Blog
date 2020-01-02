package com.abing.blog.mapper;

import com.abing.blog.baseDao.MyMapper;
import com.abing.blog.entity.Tag;
import org.springframework.security.core.Transient;

import java.util.List;

/**
 * Description: TagMapper
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/14 22:48
 * @since JDK 1.8
 */
@Transient
public interface TagMapper extends MyMapper<Tag> {

    /**
     * description: 根据博客id获取标签
     *
     * @param blogId 博客id
     * @return java.util.List<com.abing.blog.entity.Tag>
     * @author LiBingxiang
     * @date 2020/01/02 19:51:35
     */
    List<Tag> listTagsByBlogId(Integer blogId);
}
