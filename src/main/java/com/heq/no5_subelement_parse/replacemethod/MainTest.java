package com.heq.no5_subelement_parse.replacemethod;

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
        Method method = (Method) context.getBean("method");
        method.display();
    }
}
