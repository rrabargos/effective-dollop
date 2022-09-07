package com.crocell.vuespringshop.extensions;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
  public class ApiDocConfig {
    @Bean
    public OpenAPI api() {
      return new OpenAPI()
              .info(new Info().title("AppName API")
                      .description("Spring sample application")
                      .version("v0.0.1"));
    }
  }
