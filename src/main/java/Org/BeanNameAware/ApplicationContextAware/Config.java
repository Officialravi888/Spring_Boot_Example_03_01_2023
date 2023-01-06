package Org.BeanNameAware.ApplicationContextAware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "myCustomBeanName")
    public SimpleBean getMyBeanName() {
        return new SimpleBean("ravi");
    }
}
