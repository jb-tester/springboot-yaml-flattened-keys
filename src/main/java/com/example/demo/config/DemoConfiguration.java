package com.example.demo.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({MapConfigProperties.class, WithNestedPojoConfigProperties.class})
public class DemoConfiguration {

}
