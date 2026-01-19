package com.apps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.JacksonJsonMessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@Configuration
public class CommonConfig {

    @Bean
    public MessageConverter jacksonJmsMessageConverter() {
        // Use JacksonJsonMessageConverter instead of MappingJackson2MessageConverter
        JacksonJsonMessageConverter converter = new JacksonJsonMessageConverter();

        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");

        return converter;
    }
}