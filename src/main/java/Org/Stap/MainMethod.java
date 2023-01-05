package Org.Stap;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class MainMethod {
//    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("stap.xml");
//        Emp obj= (Emp) context.getBean("ravi");
//        obj.displayInfo();
//        System.out.println(obj);
//    }
//}

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainMethod {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("stap.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Emp student=(Emp) factory.getBean("ravi");
        student.displayInfo();
    }
}