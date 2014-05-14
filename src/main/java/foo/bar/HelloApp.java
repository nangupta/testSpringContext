package foo.bar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    @Autowired
    static HelloService helloService;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        testBeanCount ob =new testBeanCount();
        ob.check(context);
        System.out.println(helloService.sayHello());
    }
}
