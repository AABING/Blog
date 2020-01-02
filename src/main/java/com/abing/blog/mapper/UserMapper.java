package com.abing.blog.mapper;

import com.abing.blog.baseDao.MyMapper;
import com.abing.blog.entity.User;
import com.abing.blog.pojo.UserPojo;
import org.springframework.security.core.Transient;

/**
 * Description: UserMapper
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/14 22:47
 * @since JDK 1.8
 */
@Transient
public interface UserMapper extends MyMapper<User> {
}
