package com.dimitri;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "priceSearch")

    public PriceMaker getService(){
        return new PriceMakerImpl();
    }


}
