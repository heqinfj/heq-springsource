package com.heq.no3_parese_custom_element.conf;

import com.heq.no3_parese_custom_element.UserDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @Auther: heq
 * @Date: 2018/12/19
 * @Description:
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("user",new UserDefinitionParser());
    }
}
