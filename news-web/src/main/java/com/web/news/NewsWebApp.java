package com.web.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tony
 * @create 2022-06-18 10:40
 */

@SpringBootApplication
public class NewsWebApp {

    public static void main(String[ ] args){
        SpringApplication.run(NewsWebApp.class,args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
