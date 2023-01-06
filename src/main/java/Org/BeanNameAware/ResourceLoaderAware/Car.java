package Org.BeanNameAware.ResourceLoaderAware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class Car implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

//    public Resource readMetadataFile() {
//        Resource file = resourceLoader.getResource("src/main/java/Org/BeanNameAware/ResourceLoaderAware/File.txt");;
//        return file;


    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
    public void Engin(){
        System.out.println("Engin is very importent fule is Car");
    }
}
