package Org.BeanNameAware.ResourceLoaderAware.Example02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ReExe02.xml");
        CustomResourceLoader customResourceLoader = applicationContext.getBean(CustomResourceLoader.class);
        Resource classpathResource = customResourceLoader
                .getResource("src/main/java/Org/BeanNameAware/ResourceLoaderAware/Example02/File.txt");

        readFileThroughResource(classpathResource);
    }

    private static void readFileThroughResource(Resource resource)
    {
        try {
            InputStream is = resource.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
