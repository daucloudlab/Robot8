package kz.kaznitu.lessons.main;


import kz.kaznitu.lessons.interfaces.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all-context.xml") ;

        T1000Pool robots = (T1000Pool)context.getBean("robotCollections") ;
        robots.action();
    }
}
