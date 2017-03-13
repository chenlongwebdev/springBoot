package com.thinkInJava.Annotion.ch1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraint {
	boolean primaryKey() default false;
	boolean nullField() default true;
	boolean unique() default false;
}
