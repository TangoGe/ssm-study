package com.tango.spring.aop.aspectj.xml;


import org.aspectj.lang.JoinPoint;

/**
 * 切面类
 */
public class MyAspect {
    /**
     * 前置通知
     */
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("前置通知，模拟权限检查.....");
        System.out.println("目标类是：" + joinPoint.getTarget());
    }

    /**
     * 后置通知
     */
    public void myAfterReturning() {

    }

    /**
     * 环绕通知
     */
    public void myAround() {

    }

    /**
     * 异常通知
     */
    public void myAfterThrowing() {

    }

    /**
     * 最终通知
     */
    public void myAfter() {

    }
}
