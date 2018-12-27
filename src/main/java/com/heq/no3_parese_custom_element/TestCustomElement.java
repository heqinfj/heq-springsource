package com.heq.no3_parese_custom_element;

import com.heq.no3_parese_custom_element.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: heq
 * @Date: 2018/12/19
 * @Description:
 */
public class TestCustomElement {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/cust-elem-spring.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.getUserName() + ":" + user.getEmail());
    }
}
