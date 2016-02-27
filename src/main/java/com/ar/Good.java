package com.ar;

/**
 * Created by Joan do Carmo on 09/11/15.
 */
import com.google.inject.BindingAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
@Target(ElementType. LOCAL_VARIABLE)
public @interface Good {}