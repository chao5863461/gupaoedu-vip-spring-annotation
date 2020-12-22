package com.gupaoedu.cycleWithAOP;

//import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 多数据源，切面处理类
 *
 */
//@Slf4j
@Aspect
@Component
public class LogAspect implements Ordered {

    public  LogAspect(){
        System.out.println("initialize LogAspect....");
    }

    @Pointcut("@annotation(com.gupaoedu.cycleWithAOP.Log)")
    public void logPointCut() {

    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        Log ds = method.getAnnotation(Log.class);

        System.out.println("aspect-around:before.");

        try {
            return point.proceed();

        } finally {
            System.out.println("aspect-around:after.");
            //log.debug("clean datasource");
        }
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
