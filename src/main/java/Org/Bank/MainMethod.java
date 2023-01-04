package Org.Bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Bank.xml");
        AllDetels A=(AllDetels) context.getBean("Im");
        A.Imp();
    }
}
