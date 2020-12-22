package com.gupaoedu.cycleByPrototype;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Created by Tom.
 */
public class MyTest {

    @Test
    public void test2WithGetBeanNames() {
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);

        String[] beanNames = app.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanNames)
                .replaceAll("\\[|\\]", "")
                .replaceAll(", ", "\n"));
        /**不会报错
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

    /**
     * 启动的时候不会不错（因为非单例Bean默认不会初始化，而是使用时才会初始化），所以很简单咱们只需要手动getBean()或者在一个单例Bean内@Autowired一下它即可
     *
     */
    @Test
    public void test2WithGetbean() {
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);

       app.getBean("a");
        /**
         * if (isPrototypeCurrentlyInCreation(beanName)) {
         * 				throw new BeanCurrentlyInCreationException(beanName);
         *                        }
         */
    }
}
