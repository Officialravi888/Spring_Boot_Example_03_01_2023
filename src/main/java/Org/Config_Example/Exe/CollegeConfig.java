package Org.Config_Example.Exe;

import Org.University.College;
import org.springframework.context.annotation.Bean;

public class CollegeConfig {
    @Bean
    public College collageBean(){
        return new College();
    }
}
