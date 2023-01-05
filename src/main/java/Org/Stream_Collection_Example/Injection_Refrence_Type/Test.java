package Org.Stream_Collection_Example.Injection_Refrence_Type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("Injection.xml");
        A temp=(A) context.getBean("aref");
        System.out.println(temp.getX());

        System.out.println(temp.getOb().getY());
        System.out.println(temp);
        System.out.println(temp.toString());
    }
}
