package com.abing.blog.pojo;

import com.abing.blog.entity.Blog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: CommentPojo
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/15 21:45
 * @since JDK 1.8
 */
@Data
@ApiModel(description = "评论Pojo")
public class CommentPojo {
    @ApiModelProperty("评论id")
    private Long id;

    @ApiModelProperty("用户昵称")
    private String nickname;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("头像")
    private String avatar;

    @ApiModelProperty("评论时间")
    private String createTime;

    @ApiModelProperty("所属博客")
    private Blog blog;

    @ApiModelProperty("子评论")
    private List<CommentPojo> replyComments = new ArrayList<>();
}
