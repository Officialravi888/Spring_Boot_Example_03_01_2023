package Org.BeanNameAware.ResourceLoaderAware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name = "RaviKant")
        public Car getCar(){
            return new Car();

    }
}
