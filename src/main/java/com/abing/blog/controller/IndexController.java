package com.abing.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description: 测试
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/19 16:48
 * @since JDK 1.8
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public ModelAndView index(ModelAndView mv) {
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("/blog")
    public ModelAndView blog(ModelAndView mv) {
        mv.setViewName("blog");
        return mv;
    }

    @GetMapping("/types")
    public ModelAndView types(ModelAndView mv) {
        mv.setViewName("types");
        return mv;
    }

    @GetMapping("/tags")
    public ModelAndView tags(ModelAndView mv) {
        mv.setViewName("tags");
        return mv;
    }

    @GetMapping("/archives")
    public ModelAndView archives(ModelAndView mv) {
        mv.setViewName("archives");
        return mv;
    }

    @GetMapping("/about")
    public ModelAndView about(ModelAndView mv) {
        mv.setViewName("about");
        return mv;
    }
}
