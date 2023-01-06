package Org.BeanNameAware.BeanNameAware01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "myCustomBeanName")
    public MyBeanName getMyBeanName() {
        return new MyBeanName();
    }

}
