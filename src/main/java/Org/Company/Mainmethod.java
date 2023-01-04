package Org.Company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainmethod {
    public static void main(String[] args) {
//ApplicationContext context=new ClassPathXmlApplicationContext("Company.xml");

        ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
        CompanyDetels obj = (CompanyDetels) context.getBean("raj");
        obj.Info();
    }
}
