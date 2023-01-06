package Org.BeanNameAware.ResourceLoaderAware.Example01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class SpringDemo {
    public static void main(String[] args) throws IOException {
        ApplicationContext context=new ClassPathXmlApplicationContext("Exe01ResourceAware.xml");
        EntitlementService obj= (EntitlementService) context.getBean("entitlementService");
        Resource resource = obj.getResource("File.txt");
        InputStream is =resource.getInputStream();
        try{
            int i=0;
            while((i=is.read())!=-1)
            {
                char c=(char)i;
                System.out.print(c);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(is!=null)
                is.close();
        }
    }
}
