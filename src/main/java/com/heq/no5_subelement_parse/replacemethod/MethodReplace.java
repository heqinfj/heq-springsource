package com.heq.no5_subelement_parse.replacemethod;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @Auther: heq
 * @Date: 2018/12/27
 * @Description:
 */
public class MethodReplace implements MethodReplacer {

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("我是替换方法");
        return null;
    }
}
