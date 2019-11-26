package com.github.shihyuho.jackson.databind.autoconfigure;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "jackson.dynamic.filter")
public class JacksonDynamicFilterProperties {

  /**
   * Application will halt if any exception occurred while initialing jackson-dynamic-filter;
   * otherwise just write a error log.
   */
  private boolean failFast;

  private Resolver resolver = new Resolver();

  public boolean isFailFast() {
    return failFast;
  }

  public void setFailFast(boolean failFast) {
    this.failFast = failFast;
  }

  public Resolver getResolver() {
    return resolver;
  }

  public void setResolver(Resolver resolver) {
    this.resolver = resolver;
  }

  public static class Resolver {
    private String[] classNames;

    public String[] getClassNames() {
      return classNames;
    }

    public void setClassNames(String[] classNames) {
      this.classNames = classNames;
    }
  }
}
