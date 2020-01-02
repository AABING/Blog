package com.abing.blog.service;

import com.abing.blog.entity.Type;

import java.util.List;

/**
 * Description: TypeService
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2020/01/02 19:36
 * @since JDK 1.8
 */
public interface TypeService {

    /**
     * description: 获取所有分类
     *
     * @return java.util.List<com.abing.blog.pojo.Type>
     * @author LiBingxiang
     * @date 2020/01/02 19:42:11
     */
    List<Type> listTypes() throws Exception;
}
