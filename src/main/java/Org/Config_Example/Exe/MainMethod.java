package Org.Config_Example.Exe;

import Org.University.College;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMethod {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college=context.getBean("collageBean",College.class);
        college.test();
    }
}
