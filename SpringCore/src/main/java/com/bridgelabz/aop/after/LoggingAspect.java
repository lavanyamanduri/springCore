package com.bridgelabz.aop.after;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect
{
	
	@Before("execution(* com.bridgelabz.aop.after.EmployeeService.addEmployee())")
	public void logBefore(JoinPoint joinPoint)
	{

		System.out.print("logBefore() is running!");
		System.out.println(", before "
				+ joinPoint.getSignature().getName() + " method");
		System.out.println("******");
	}

	@After("execution(* com.bridgelabz.aop.after.EmployeeService.addEmployee())")
	public void logAfter(JoinPoint joinPoint)
	{

		System.out.print("logAfter() is running!");
		System.out.println(", after "
				+ joinPoint.getSignature().getName() + " method");
		System.out.println("******");
	}

	@AfterReturning(
			pointcut = "execution(* com.bridgelabz.aop.after.EmployeeService.addEmployee())",
			returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result)
	{

		System.out.print("logAfterReturning() is running!");
		System.out.println(", after "
				+ joinPoint.getSignature().getName() + " method");
		System.out.println("Method returned value is = " + result);
		System.out.println("******");
	}
	
	@AfterThrowing(
			pointcut = "execution(* com.bridgelabz.aop.after.EmployeeService.addEmployee())",
			throwing = "exception")
	public void logAfterThrowing(JoinPoint joinPoint,
			Throwable exception)
	{

		System.out.print("logAfterThrowing() is running!");
		System.out.println(
				", after " + joinPoint.getSignature().getName()
						+ " method throwing exception");
		System.out.println("exception = " + exception);
		System.out.println("******");
	}
	
	@Around("execution(* com.bridgelabz.aop.after.EmployeeService.addEmployee(..))")
	public void logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
	{

		System.out.println("logAround() is running!");
		System.out.println("hijacked method = " + proceedingJoinPoint.getSignature().getName());
		System.out.println("hijacked arguments = " + Arrays.toString(proceedingJoinPoint.getArgs()));
			
		System.out.println("Around before is running!");
		proceedingJoinPoint.proceed(); //continue on the intercepted method
		System.out.println("Around after is running!");
			
		System.out.println("******");
	}


}