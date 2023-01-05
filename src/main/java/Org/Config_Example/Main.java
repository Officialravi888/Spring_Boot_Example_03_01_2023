//package Org.Config_Example;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class Main {
//    public static void main(String[] args) {
//        ApplicationContext context= new AnnotationConfigApplicationContext();
//        context.scan("Org.Config_Example.ComponentDemo");
//        context.refresh();
//        // Getting the Bean from the component class
//        ComponentDemo componentDemo = context.getBean(ComponentDemo.class);
//        componentDemo.demoFunction();
//
//        // Closing the context
//        // using close() method
//        componentDemo.demoFunction();
//
//    }
//}
