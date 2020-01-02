package com.abing.blog.service.impl;

import com.abing.blog.entity.Type;
import com.abing.blog.mapper.TypeMapper;
import com.abing.blog.service.TypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: TypeServiceImpl
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2020/01/02 19:38
 * @since JDK 1.8
 */
@Service
@Slf4j
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeMapper typeMapper;

    @Override
    public List<Type> listTypes() throws Exception {
        List<Type> types = typeMapper.selectAll();
        if (types == null) {
            throw new Exception("暂无分类");
        }
        return types;
    }
}
