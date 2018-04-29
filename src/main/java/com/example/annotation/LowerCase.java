package com.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LowerCase {
	
	String parameterName() ;
	
	public enum type{
		PARAM,PATH_PARAM
	}
	type type() default type.PARAM;
	

}