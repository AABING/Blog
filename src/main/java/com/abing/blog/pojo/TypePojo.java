package com.abing.blog.pojo;

import com.abing.blog.entity.Blog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: TypePojo
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/15 22:00
 * @since JDK 1.8
 */
@Data
@ApiModel(description = "分类Pojo")
public class TypePojo {
    @ApiModelProperty("分类id")
    private Long id;

    @ApiModelProperty("分类名称")
    private String name;

    @ApiModelProperty("此分类下的博客")
    private List<Blog> blogs = new ArrayList<>();
}
