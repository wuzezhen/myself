package com.ze;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kz
 * @create 2020-05-25 15:20
 * @exception
 */
@Configuration
@EnableConfigurationProperties(ZeProperties.class)
@ConditionalOnClass(ZeService.class)
public class ZeAutoConfiguration {

    private ZeProperties zeProperties;


    @Autowired
    public ZeAutoConfiguration(ZeProperties zeProperties) {
        this.zeProperties = zeProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "spring.ze",value = "enabled",matchIfMissing = true,havingValue = "true")
    public ZeService zeService(){
        return new ZeService(zeProperties);
    }
}
