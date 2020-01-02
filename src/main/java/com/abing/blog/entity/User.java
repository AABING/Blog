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
 * Description: User
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/13 12:40
 * @since JDK 1.8
 */
@Data
@Entity
@Table(name = "t_user")
@ApiModel(description = "用户")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "Mysql")
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
}
