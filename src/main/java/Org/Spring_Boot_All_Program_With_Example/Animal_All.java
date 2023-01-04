package Org.Spring_Boot_All_Program_With_Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Animal_All{
    public static void main(String[] args) {
//        Animal obj=new Dog();
//        obj.Barking();
//        Animal obj1=new Cat();
//        obj1.Barking();
//        Been_Animal obj= new Been_Animal(new Dog());
//        obj.Test();

        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigAnimal.class);
        Been_Animal ben=(Been_Animal) context.getBean("raj");
        ben.Test();
    }
}
