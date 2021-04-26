package com.example.demo;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.domain.ReactiveAuditorAware;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Component
public class JPAAuditorAware implements AuditorAware<Long> {

  @Override
  public Optional<Long> getCurrentAuditor() {

    return Optional.of(555L);
  }
  @Bean
  ReactiveAuditorAware<Long> auditorAware() {
    Snowflake snowflake = IdUtil.createSnowflake(1, 1);
    return () -> {
    Long id = snowflake.nextId();
      return Mono.just(id);
    };
  }
}
