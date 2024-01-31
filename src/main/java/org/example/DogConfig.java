package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DogConfig {

    @Bean("malinua")
    Dog getDog(){
        return new Dog(4,2,true);
    }

    @Bean
    public String eyesColor(){
        return new String("brown");
    }

}
