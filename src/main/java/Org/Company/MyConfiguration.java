package Org.Company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public Office office(){
        return new Timeing();

        }
        @Bean(name="raj")
        public CompanyDetels companyDetels(){
        return new CompanyDetels(office());
        }
    }

