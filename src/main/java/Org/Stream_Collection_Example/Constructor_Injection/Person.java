package Org.Stream_Collection_Example.Constructor_Injection;

public class Person {
    private String name;
    private int personid;


    public Person(String name, int personid){
        this.name=name;
        this.personid=personid;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personid=" + personid +
                '}';
    }
}
