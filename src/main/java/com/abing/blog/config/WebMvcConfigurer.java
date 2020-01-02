package com.abing.blog.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.servlet.MultipartConfigElement;
import javax.servlet.annotation.MultipartConfig;
import java.nio.channels.MulticastChannel;

/**
 * Description: WebMvcConfigurer
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/15 15:04
 * @since JDK 1.8
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport {
    @Value("${file.staticAccessPath}")
    private String staticAccessPath;
    @Value("${file.imagesPath}")
    private String imagesPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 图片访问路径
        registry.addResourceHandler(staticAccessPath).addResourceLocations("file:" + imagesPath);

        // swagger访问路径
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
