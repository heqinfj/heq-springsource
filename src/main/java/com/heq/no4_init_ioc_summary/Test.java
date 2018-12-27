package com.heq.no4_init_ioc_summary;

import org.springframework.util.StringUtils;

/**
 * @Auther: heq
 * @Date: 2018/12/21
 * @Description:
 */
public class Test{
    public static void main(String[] args) {
        String resourceLoaderPath = "/WEB-INF/classes/com/al/crm,classpath:com/ai";
        String[] paths = StringUtils.commaDelimitedListToStringArray(resourceLoaderPath);
        System.out.println(paths);
    }
}
