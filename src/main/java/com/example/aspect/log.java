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

}
