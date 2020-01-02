package com.abing.blog.pojo;

import com.abing.blog.entity.Type;
import com.abing.blog.entity.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Description: 首页
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2020/01/02 14:27
 * @since JDK 1.8
 */
@Data
@ApiModel(description = "首页")
public class SimpleBlogPojo {
    @ApiModelProperty("博客id")
    private Long id;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("封面图片")
    private String firstPicture;

    @ApiModelProperty("浏览次数")
    private Integer views;

    @ApiModelProperty("创建时间")
    private String createTime;

    @ApiModelProperty("更新时间")
    private String updateTime;

    @ApiModelProperty("分类")
    private Type type;

    @ApiModelProperty("用户")
    private User user;
}