package Org.Tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {

        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("Tutorialspoint.xml");
            Show obj = (Show) context.getBean("showq");
            obj.getMessage();
        }

}
