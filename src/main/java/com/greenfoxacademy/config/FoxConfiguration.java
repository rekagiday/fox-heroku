package com.greenfoxacademy.config;

import com.greenfoxacademy.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by User on 2017. 05. 04..
 */
@Configuration
public class FoxConfiguration {

  @Bean
  public Fox getFox(){
    return new Fox();
  }

}
