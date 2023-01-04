package Org.Phones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManeMethod {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("Phone.xml");
        AllDetels obj= (AllDetels)context.getBean("Connect");
        obj.Ph();
    }
}
