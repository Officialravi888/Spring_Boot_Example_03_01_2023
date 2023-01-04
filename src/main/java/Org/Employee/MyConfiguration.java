package Org.Employee;

import Org.Phones.AllDetels;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    public Employee employee() {
        return new Soft();
    }

    @Bean(name="E")
    public AllEmployee allEmployee(){
        return new AllEmployee(employee());
    }

}
