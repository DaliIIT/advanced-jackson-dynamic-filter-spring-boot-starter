package com.github.shihyuho.jackson.databind.autoconfigure.dynamicFilter;


import com.github.shihyuho.jackson.databind.autoconfigure.dynamicFilter.resolver.SerializeAllExceptResolver;

import java.lang.annotation.*;

/**
 * {@link SerializeAllExceptResolver}
 * 
 * @author Matt S.Y. Ho
 *
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SerializeAllExcept {

  String[] value();
  
}
