package Org.Employee;

import Org.Company.CompanyDetels;
import Org.Stream_Collection_Example.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {
    public static void main(String[] args) {
        //ApplicationContext context= new ClassPathXmlApplicationContext("EmpConfig.xml");
       // AllEmployee All=(AllEmployee) context.getBean("dp");
     //All.Emg();
        ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
        AllEmployee obj=(AllEmployee) context.getBean("E");
         obj.EEm();
    }
}
