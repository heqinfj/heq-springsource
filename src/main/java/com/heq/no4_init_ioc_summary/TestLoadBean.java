package com.heq.no4_init_ioc_summary;

import com.heq.model.UserBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: heq
 * @Date: 2018/12/17
 * @Description:
 */
public class TestLoadBean {
    /**
     *  Spring 中编程式使用 IOC 容器
     * @param args
     */
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("spring/bean.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        int count = reader.loadBeanDefinitions(resource);
        System.out.println(count);
        Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>(256);
        String[] beanDefinitionNames = factory.getBeanDefinitionNames();
        for (String beanDefinitionName:beanDefinitionNames) {
            BeanDefinition beanDefinition = factory.getBeanDefinition(beanDefinitionName);
            beanDefinitionMap.put(beanDefinitionName,beanDefinition);
        }
        System.out.println(beanDefinitionMap);
        //UserBean bean = factory.getBean(UserBean.class);
        UserBean bean = (UserBean) factory.getBean("userBean");
        System.out.println(bean);
    }
}
