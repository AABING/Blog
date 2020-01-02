package com.abing.blog.pojo;

import com.abing.blog.entity.Blog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: TagPojo
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/15 21:58
 * @since JDK 1.8
 */
@ApiModel(description = "标签Pojo")
public class TagPojo {
    @ApiModelProperty("标签id")
    private Long id;

    @ApiModelProperty("标签名称")
    private String name;

    @ApiModelProperty("此标签下的博客")
    private List<Blog> blogs = new ArrayList<>();
}
