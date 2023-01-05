package Org.Pro;

public class Test {
    public static void main(String[] args) {
        Cat a = new Cat();
        Dog b = new Dog();
        a.milk();
        show(b);
        show(a);

    }
        public static void show (Animal d){
            d.eat();
        }
    }

