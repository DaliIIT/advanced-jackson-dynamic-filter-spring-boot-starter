package com.github.shihyuho.jackson.databind.autoconfigure.dynamicFilter;


import com.github.shihyuho.jackson.databind.autoconfigure.dynamicFilter.resolver.FilterOutAllExceptResolver;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@link FilterOutAllExceptResolver}
 * 
 * @author Matt S.Y. Ho
 *
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FilterOutAllExcept {

  String[] value();

}
