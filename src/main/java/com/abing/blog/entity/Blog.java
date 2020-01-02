package com.abing.blog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Description: Blog
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/12 18:55
 * @since JDK 1.8
 */
@Data
@Entity
@Table(name = "t_blog")
@ApiModel(description = "博客")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "Mysql")
    @ApiModelProperty("博客id")
    private Long id;

    @NotNull
    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("封面图片")
    private String firstPicture;

    @ApiModelProperty("标记")
    private String flag;

    @ApiModelProperty("浏览次数")
    private Integer views = 1;

    @ApiModelProperty("赞赏开启")
    private int appreciation = 0;

    @ApiModelProperty("版权开启")
    private int shareStatement = 1;

    @ApiModelProperty("评论开启")
    private int commentabled = 1;

    @ApiModelProperty("发布")
    private int published = 1;

    @ApiModelProperty("推荐")
    private int recommend = 1;

    @NotNull
    @ApiModelProperty("创建时间")
    private String createTime;

    @ApiModelProperty("更新时间")
    private String updateTime;

    @NotNull
    @ApiModelProperty("分类id")
    private Long typeId;

    @NotNull
    @ApiModelProperty("用户id")
    private Long userId;
}
