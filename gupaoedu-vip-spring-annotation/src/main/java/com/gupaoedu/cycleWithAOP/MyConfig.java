package com.gupaoedu.cycleWithAOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Tom.
 * 把Cat加载进来了，
 */
@EnableAspectJAutoProxy
@Configuration
@ComponentScan(value = "com.gupaoedu.cycleWithAOP")
public class MyConfig {

}
