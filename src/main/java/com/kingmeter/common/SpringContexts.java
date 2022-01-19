package com.kingmeter.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;


/**
 * @description: spring ioc
 * @author: crazyandy
 */
@Component
public class SpringContexts implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext arg0)
            throws BeansException {
        applicationContext = arg0;
    }

    /**
     * get applicationContext bean
     * @return
     */
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    /**
     * get bean according to id
     * @param id
     * @return
     */
    public static Object getBean(String id){
        return applicationContext.getBean(id);
    }

    /**
     * get bean according to class
     * @param c
     * @return
     */
    public static <T> T getBean(Class<T> c){
        return applicationContext.getBean(c);
    }

    /**
     * get all the beans according to clazz
     * @param c
     * @return
     */
    public static <V> Map<String,V> getBeansByClass(Class<V> c){
        return applicationContext.getBeansOfType(c);
    }
}