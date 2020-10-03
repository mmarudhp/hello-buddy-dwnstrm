package com.hello.buddy.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Endpoint {
    enum HttpMethodType {POST, PUT, GET, DELETE}

    String url() default "/";
    HttpMethodType type() default HttpMethodType.GET;
}
