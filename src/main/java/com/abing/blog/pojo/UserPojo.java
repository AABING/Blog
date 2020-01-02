package com.abing.blog.pojo;

import com.abing.blog.entity.Blog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: UserPojo
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/15 22:03
 * @since JDK 1.8
 */
@Data
@ApiModel(description = "用户Pojo")
public class UserPojo {
    @ApiModelProperty("用户id")
    private Long id;

    @ApiModelProperty("用户昵称")
    private String nickname;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("头像")
    private String avatar;

    @ApiModelProperty("类型")
    private Integer type;

    @ApiModelProperty("创建时间")
    private String createTime;

    @ApiModelProperty("更新时间")
    private String updateTime;

    @ApiModelProperty("此用户的博客")
    private List<Blog> blogs = new ArrayList<>();
}
