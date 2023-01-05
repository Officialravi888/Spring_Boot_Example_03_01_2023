package Org.Stream_Collection_Example.Constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Constructor.xml");
        Person p= (Person) context.getBean("person");
        System.out.println(p);
    }
}
