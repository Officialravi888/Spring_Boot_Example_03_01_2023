package Org.BeanNameAware.ResourceLoaderAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {
    public static void main(String[] args) {
        //ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        ApplicationContext context1= new ClassPathXmlApplicationContext("Reso.xml");
        Car obj=(Car) context1.getBean("ravi");
        obj.Engin();
//        Car obj1= (Car) context.getBean("Ravikant");
//        obj1.Engin();
    }
}
