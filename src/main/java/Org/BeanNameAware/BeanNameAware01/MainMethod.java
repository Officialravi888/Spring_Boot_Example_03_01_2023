package Org.BeanNameAware.BeanNameAware01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyBeanName myBeanName = context.getBean(MyBeanName.class);
        myBeanName.getClass();
    }
}
