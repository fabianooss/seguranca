package org.senac.seguranca.auth.filters;

import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Filters {

  private final LoginFilter loginFilter;
  private final RestFilter restFilter;

  @Autowired
  public Filters(LoginFilter loginFilter, RestFilter restFilter) {
    this.loginFilter = loginFilter;
    this.restFilter = restFilter;
  }

  @Bean
  public FilterRegistrationBean<LoginFilter> loginRegistrationBean() {
    FilterRegistrationBean<LoginFilter> filterRegistrationBean = new FilterRegistrationBean<LoginFilter>();
    filterRegistrationBean.setFilter(loginFilter);
    filterRegistrationBean.setUrlPatterns(Collections.singletonList("/login/*"));
    return filterRegistrationBean;
  }

  @Bean
  public FilterRegistrationBean<RestFilter> restRegistrationBean() {
    FilterRegistrationBean<RestFilter> filterRegistrationBean = new FilterRegistrationBean<RestFilter>();
    filterRegistrationBean.setFilter(restFilter);
    filterRegistrationBean.setUrlPatterns(Collections.singletonList("/rest/*"));
    return filterRegistrationBean;
  }
}
