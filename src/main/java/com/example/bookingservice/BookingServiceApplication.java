package com.example.bookingservice;

//import com.example.bookingservice.filterandinterceptor.CustomFilter;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Collections;

@EnableJpaAuditing
@EnableMongoAuditing
@SpringBootApplication
@EnableScheduling
public class BookingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookingServiceApplication.class, args);
    }
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
//    @Bean
//    FilterRegistrationBean<CustomFilter> customFilterRegistration(CustomFilter customFilter){
//        FilterRegistrationBean<CustomFilter> filterRegistrationBean=new FilterRegistrationBean<CustomFilter>(customFilter);
//        filterRegistrationBean.setOrder(-1);
//        filterRegistrationBean.setName("newone");
//        filterRegistrationBean.setUrlPatterns(Collections.singleton("/hai/*"));
//        return filterRegistrationBean;
//    }
}
