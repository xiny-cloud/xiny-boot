package com.xinycloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: xiny
 * @Date: 2020/1/5 0005 00:38
 * @Description:
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    private String upLoadPath = "D://upFiles";
    private String webAppPath = "D://webapp";
    private String staticLocations = "classpath:/static/,classpath:/public/";

    /**
     * 静态资源的配置
     * - 使得可以从磁盘中读取 Html、图片、视频、音频等
     * - 可以从项目中读取静态资源
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //addResourceHandler()方法设置访问路径前缀，addResourceLocations()方法设置资源路径
        registry.addResourceHandler("/**")
                .addResourceLocations("file:" + upLoadPath + "//", "file:" + webAppPath + "//")
                .addResourceLocations(staticLocations.split(","));
    }
}
