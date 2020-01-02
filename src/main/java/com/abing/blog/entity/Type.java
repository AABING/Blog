package com.abing.blog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

/**
 * Description: Type
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/12 19:01
 * @since JDK 1.8
 */
@Data
@Entity
@Table(name = "t_type")
@ApiModel(description = "分类")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "Mysql")
    @ApiModelProperty("分类id")
    private Long id;

    @ApiModelProperty("分类名称")
    private String name;
}
