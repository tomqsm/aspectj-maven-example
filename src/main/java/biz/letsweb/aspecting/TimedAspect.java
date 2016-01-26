package biz.letsweb.aspecting;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TimedAspect {

    @Pointcut("execution(@biz.letsweb.aspecting.Timed * *(..))")
    public void timedMethods() {}

    @Before("timedMethods()")
    public void testModeOnly(JoinPoint joinPoint) {
        System.out.println("*before action*");
    }

    @After("timedMethods()")
    public void afterAction(JoinPoint joinPoint) {
        System.out.println("*after action*");
    }

    @AfterReturning("timedMethods()")
    public void afterTransactionalMethod(JoinPoint joinPoint) {
        System.out.println("*after return action*");
    }
}
