package com.example.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LowerCaseAspect {
	
	   
	    
	    @Pointcut("@annotation(lowerCase)")
	    public void callAt(LowerCase lowerCase) {
	    }
	    
	    
	    @Around("callAt(lowerCase)")
	    public Object decrypt(ProceedingJoinPoint joinPoint,LowerCase lowerCase) throws Throwable {
	        final long start = System.currentTimeMillis();
	        System.out.println(joinPoint.getSignature() + " LoweCase -" + lowerCase.parameterName()+"  Type-"+ lowerCase.type());
            //TODO Convert the  parameter to lowercase and set then proceed.
	        final Object proceed = joinPoint.proceed();

	        final long executionTime = System.currentTimeMillis() - start;

	        System.out.println(joinPoint.getSignature() + " LoweCase in " + executionTime + "ms");

	        return proceed;
	    }
	   
}
