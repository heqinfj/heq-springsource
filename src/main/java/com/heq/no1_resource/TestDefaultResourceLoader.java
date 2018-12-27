package com.heq.no1_resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;

/**
 * @Auther: heq
 * @Date: 2018/12/17
 * @Description:
 */
public class TestDefaultResourceLoader {
    public static void main(String[] args) {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource fileResource1 = resourceLoader.getResource("D:/Users/chenming673/Documents/spark.txt");
        System.out.println("fileResource1 is FileSystemResource: " + (fileResource1 instanceof FileSystemResource));

        Resource fileResource2 = resourceLoader.getResource("/Users/chenming673/Documents/spark.txt");
        System.out.println("fileResource2 is ClassPathResource: " + (fileResource2 instanceof ClassPathResource));

        Resource urlResource1 = resourceLoader.getResource("file:/Users/chenming673/Documents/spark.txt");
        System.out.println("urlResource1 is UrlResource: " + (urlResource1 instanceof UrlResource));

        Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
        System.out.println("urlResource2 is UrlResource: " + (urlResource2 instanceof UrlResource));
    }
}
