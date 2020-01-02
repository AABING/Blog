package com.abing.blog.mapper;

import com.abing.blog.baseDao.MyMapper;
import com.abing.blog.entity.Type;
import org.springframework.security.core.Transient;

/**
 * Description: TypeMapper
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/14 22:43
 * @since JDK 1.8
 */
@Transient
public interface TypeMapper extends MyMapper<Type> {
}
