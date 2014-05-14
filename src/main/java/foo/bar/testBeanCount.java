package foo.bar;

import org.springframework.context.ApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: nangupta
 * Date: 5/13/14
 * Time: 12:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class testBeanCount{

    public void check(ApplicationContext context)
    {
         String [] names = context.getBeanDefinitionNames();

        System.out.println("beans count  = "+ context.getBeanDefinitionCount());
        System.out.println("beans definition names = "+ names.toString());
    }
}
