package com.backend.springboot_2.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

/**
 * Title: todoedit
 * Description: springboot_2
 * author: wenjun
 * date: 2018/11/25 17:13
 */
@Configuration
@Aspect
public class LogAspect {

    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void getMappingCut(){}

    /**
     * 指定织入配置方法
     */
    @Before("getMappingCut()")
    public void mappingLog(){
        System.out.println("aop req before");
    }

    /**
     * 织入规则方式
     */
    @Before("execution(* com.backend.springboot_2.service..*.*(..))")
    public void log(){
        System.out.println("aop before");
    }

    @Before("execution(* com.backend.springboot_2.service..*.*(..))")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("aop after,class : "
                + joinPoint.getTarget().getClass()
                + ", method : " + joinPoint.getSignature().getName()
                + ", args : " + Arrays.asList(joinPoint.getArgs()));
    }

}
