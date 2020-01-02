package com.abing.blog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Description: Comment
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/13 12:36
 * @since JDK 1.8
 */
@Data
@Entity
@Table(name = "t_comment")
@ApiModel(description = "评论")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "Mysql")
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

    @ApiModelProperty("所属博客id")
    private Long blogId;

    @ApiModelProperty("父评论id")
    private Long parentCommentId;
}
