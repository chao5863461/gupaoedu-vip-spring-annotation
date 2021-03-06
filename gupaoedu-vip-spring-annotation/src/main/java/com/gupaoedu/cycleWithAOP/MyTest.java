package com.gupaoedu.cycleWithAOP;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Created by Tom.
 */
public class MyTest {

    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);

        Object o = app.getBean("a");
        A a = (A)o;
        a.print1();
        System.out.println(o.getClass());
    }

    /**
     * A实例化了
     * B实例化了
     * org.springframework.context.annotation.internalConfigurationAnnotationProcessor
     * org.springframework.context.annotation.internalAutowiredAnnotationProcessor
     * org.springframework.context.annotation.internalRequiredAnnotationProcessor
     * org.springframework.context.annotation.internalCommonAnnotationProcessor
     * org.springframework.context.event.internalEventListenerProcessor
     * org.springframework.context.event.internalEventListenerFactory
     * myConfig
     * a
     * b
     */

}
