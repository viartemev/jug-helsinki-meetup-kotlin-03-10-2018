package com.viartemev.meetup.kotlin.demo.null_java_kotlin;

import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;
import javax.annotation.meta.TypeQualifierNickname;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Nonnull
//@TypeQualifierDefault({ElementType.METHOD, ElementType.PARAMETER})
@TypeQualifierNickname
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomNotNullAnnotation {
}
