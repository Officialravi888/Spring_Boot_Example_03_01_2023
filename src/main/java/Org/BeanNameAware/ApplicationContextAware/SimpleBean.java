package Org.BeanNameAware.ApplicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SimpleBean implements ApplicationContextAware {
private SimpleBean simpleBean;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            this.simpleBean=simpleBean;
    }

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }
    public void Engin(){
        System.out.println("Engin is very importent fule is Car");
    }
    private String Name;
    SimpleBean(String name){
        this.Name=name;

    }
}
