package com.tc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.tc.controller","com.tc.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
