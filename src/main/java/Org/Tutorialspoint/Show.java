package Org.Tutorialspoint;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Show {
    private String Message;
    public void setMessage(String message){
        this.Message=message;
    }
    public void getMessage(){
        System.out.println("Your Message:"+Message);
    }
}


