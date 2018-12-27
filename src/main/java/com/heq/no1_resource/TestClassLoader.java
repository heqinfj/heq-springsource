package com.heq.no1_resource;

import org.springframework.util.ClassUtils;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @Auther: heq
 * @Date: 2018/12/17
 * @Description:
 */
public class TestClassLoader {
    public static void main(String[] args) throws IOException {
        ClassLoader cl = getClassLoader();
        String path = "org/springframework";
        Enumeration<URL> resourceUrls = null;
        resourceUrls = (cl != null ? cl.getResources(path) : ClassLoader.getSystemResources(path));
        //resourceUrls = ClassLoader.getSystemResources(path);
        //System.out.println("resourceUrls: " + resourceUrls);
        while (resourceUrls.hasMoreElements()) {
            URL url = resourceUrls.nextElement();
            System.out.println(url);
        }
    }

    private static ClassLoader getClassLoader(){
        return ClassUtils.getDefaultClassLoader();
    }
}
