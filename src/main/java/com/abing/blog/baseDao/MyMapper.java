package com.abing.blog.baseDao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Description: 公用Mapper接口
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/14 16:43
 * @since JDK 1.8
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
