package com.stackroute.configuration;

import com.stackroute.configuration.DemoConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HomeInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        return new Class[] {DemoConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        return new Class[] {DemoConfig.class};
    }

    @Override
    protected String[] getServletMappings()
    {
        return new String[]  {"/"};
    }
}
