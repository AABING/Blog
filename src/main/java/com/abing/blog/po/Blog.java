package com.abing.blog.po;

import lombok.Data;

import javax.persistence.*;
import javax.xml.ws.soap.MTOM;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
public class Blog {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private String firstPicture;
    private String flag;
    private Integer views;
    private boolean appreciation;
    private boolean shareStatement;
    private boolean commentabled;
    private boolean published;
    private boolean recommend;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    @ManyToOne
    private Type type;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Tag> tags = new ArrayList<>();

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "blog")
    private List<Comment> comments = new ArrayList<>();
}
