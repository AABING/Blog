package com.abing.blog.mapper;

import com.abing.blog.baseDao.MyMapper;
import com.abing.blog.entity.Tag;

import java.util.List;

/**
 * Description: TagMapper
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/14 22:48
 * @since JDK 1.8
 */
public interface TagMapper extends MyMapper<Tag> {
    List<Tag> listTagsByBlogId(Integer blogId);
}
