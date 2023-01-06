package Org.BeanNameAware.ApplicationContextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class MainMethod{
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        SimpleBean obj= (SimpleBean) context.getBean("myCustomBeanName");
            obj.Engin();
    }
}