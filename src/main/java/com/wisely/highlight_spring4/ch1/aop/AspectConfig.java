package com.wisely.highlight_spring4.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {
	@Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")
	public void annotationPointCut(){};
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint){
		MethodSignature signature= (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action declaredAnnotation = method.getDeclaredAnnotation(Action.class);
		System.out.println("方法调用完成后  使用的注解name"+declaredAnnotation.name());
	}
	@Before("execution(* com.wisely.highlight_spring4.ch1.aop.FunctionService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature signature= (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("使用拦截器规则拦截的方法"+method.getName());
	}
	

}
