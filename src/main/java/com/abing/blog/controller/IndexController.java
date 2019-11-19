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
}
