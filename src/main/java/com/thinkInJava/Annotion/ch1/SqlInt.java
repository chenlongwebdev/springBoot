package com.thinkInJava.Annotion.ch1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SqlInt {
	int value() default 0;
	String name() default "";
	Constraint constraint() default @Constraint;
}
