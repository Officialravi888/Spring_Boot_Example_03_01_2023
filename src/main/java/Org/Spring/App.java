package Org.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("hello");
        ApplicationContext context =new ClassPathXmlApplicationContext("Config.xml");
        Student Student=(Student) context.getBean("A");
        System.out.println(Student);
        //System.out.println(Student.toString());

    }
}
