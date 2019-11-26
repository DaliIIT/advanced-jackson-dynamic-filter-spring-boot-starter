package com.github.shihyuho.jackson.databind.autoconfigure.dynamicFilter.resolver;

import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.github.shihyuho.jackson.databind.autoconfigure.dynamicFilter.FilterOutAllExcept;

/**
 * Use {@link SimpleBeanPropertyFilter#filterOutAllExcept(String...)} to build
 * {@code PropertyFilter}
 * 
 * @author Matt S.Y. Ho
 *
 */
public class FilterOutAllExceptResolver extends DynamicFilterResolver<FilterOutAllExcept> {

  @Override
  public PropertyFilter apply(FilterOutAllExcept annotation) {
    return SimpleBeanPropertyFilter.filterOutAllExcept(annotation.value());
  }

}
