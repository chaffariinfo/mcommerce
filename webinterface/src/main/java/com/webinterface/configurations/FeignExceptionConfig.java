package com.webinterface.configurations;

import com.webinterface.exceptions.CustomErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignExceptionConfig {
    @Bean
    public CustomErrorDecoder customErrorDecoder()
    {
        return(new CustomErrorDecoder());
    }
}
