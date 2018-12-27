package com.heq.no5_subelement_parse.lookupmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: heq
 * @Date: 2018/12/27
 * @Description:
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring_no5.xml");
        Display display = (Display) context.getBean("display");
        display.display();
    }
}
