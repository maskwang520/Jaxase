package com.java.annotation;

import java.lang.annotation.Repeatable;

@Repeatable(RepeatAnnotations.class)//jdk1.8������
public @interface RepeatAnnotation {
	String role();
}
