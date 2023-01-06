package Org.BeanNameAware.ResourceLoaderAware.Example01;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
public class EntitlementService implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
    public Resource getResource(String path) {
        return this.getResourceLoader().getResource(path);
    }
}