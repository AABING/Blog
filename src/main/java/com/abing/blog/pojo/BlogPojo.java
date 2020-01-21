package com.abing.blog.pojo;

import com.abing.blog.entity.Comment;
import com.abing.blog.entity.Tag;
import com.abing.blog.entity.Type;
import com.abing.blog.entity.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: BlogPojo
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/15 21:32
 * @since JDK 1.8
 */
@Data
@ApiModel(description = "博客Pojo")
public class BlogPojo {
    @ApiModelProperty("博客id")
    private Long id;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("封面图片")
    private String firstPicture;

    @ApiModelProperty("标记")
    private Integer flag;

    @ApiModelProperty("浏览次数")
    private Integer views;

    @ApiModelProperty("赞赏开启")
    private int appreciation;

    @ApiModelProperty("版权开启")
    private int shareStatement;

    @ApiModelProperty("评论开启")
    private int commentabled;

    @ApiModelProperty("发布")
    private int published;

    @ApiModelProperty("推荐")
    private int recommend;

    @ApiModelProperty("创建时间")
    private String createTime;

    @ApiModelProperty("更新时间")
    private String updateTime;

    @ApiModelProperty("分类")
    private Type type;

    @ApiModelProperty("标签")
    private List<Tag> tags = new ArrayList<>();

    @ApiModelProperty("用户")
    private User user;

    @ApiModelProperty("评论")
    private List<Comment> comments = new ArrayList<>();
}
