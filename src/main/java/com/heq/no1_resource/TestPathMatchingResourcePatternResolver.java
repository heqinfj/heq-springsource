package com.heq.no1_resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

/**
 * @Auther: heq
 * @Date: 2018/12/17
 * @Description:
 */
public class TestPathMatchingResourcePatternResolver {
    public static void main(String[] args) throws IOException {
        ResourceLoader resourceLoader = new PathMatchingResourcePatternResolver();
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = (PathMatchingResourcePatternResolver)resourceLoader;
        Resource[] resources = pathMatchingResourcePatternResolver.getResources("classpath*:org/springframework/**/*.properties");
        for(Resource resource : resources){
            System.out.println("resources: " + resource.toString());
        }
    }
}
