package Org.Spring_Boot_All_Program_With_Example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAnimal {
    @Bean
    public Animal animal(){
        return new Dog();
    }
    @Bean(name = "raj")
    public Been_Animal beenAnimal(){
        return new Been_Animal(animal());
    }

}
