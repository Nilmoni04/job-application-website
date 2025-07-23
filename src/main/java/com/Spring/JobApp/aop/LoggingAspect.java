package com.Spring.JobApp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger Logger = LoggerFactory.getLogger(LoggingAspect.class);

    //return type, class name.method name-name(arguments)
    @Before("execution(* com.Spring.JobApp.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        Logger.info("[Before] Method: " + joinPoint.getSignature().getName());
        Logger.info("Args: " + Arrays.toString(joinPoint.getArgs()));
    }
    @AfterReturning(pointcut = "execution(* com.Spring.JobApp.service.*.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        Logger.info("[AfterReturning] Method: " + joinPoint.getSignature().getName());
        Logger.info("Returned: " + result);
    }
    @AfterThrowing(pointcut = "execution(* com.Spring.JobApp.service.*.*(..))", throwing = "ex")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable ex) {
        Logger.info("[Exception] in " + joinPoint.getSignature().getName());
        Logger.info("Error: " + ex.getMessage());
    }
    @Around("execution(* com.Spring.JobApp.service.*.*(..))")
    public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();  // Start time

        Object result = joinPoint.proceed();      // Run the actual method

        long end = System.currentTimeMillis();    // End time
        Logger.info("Method " + joinPoint.getSignature().getName() +
                " took " + (end - start) + " ms");

        return result;  // Return the result back
    }
}
