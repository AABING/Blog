package com.abing.blog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: Tag
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/13 12:35
 * @since JDK 1.8
 */
@Data
@Entity
@Table(name = "t_tag")
@ApiModel(description = "标签")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "Mysql")
    @ApiModelProperty("标签id")
    private Long id;

    @ApiModelProperty("标签名称")
    private String name;
}
