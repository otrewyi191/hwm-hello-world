package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
@Aspect
@Component
public class log {
    @Pointcut("execution (* com.example..*(..))")
    public void fun(){}

    @Around("fun()")
    public void around(ProceedingJoinPoint joinPoint)
    {
        try {
            System.out.println("begin");
            System.out.println(joinPoint.getTarget().getClass().getName());
            joinPoint.proceed();
            System.out.println("end");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
