package site.acavallo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.acavallo.bean_annotation.casefactory.Case;
import site.acavallo.bean_annotation.config.ComputerConfig;
import site.acavallo.bean_annotation.monitorfactory.Monitor;
import site.acavallo.bean_annotation.motherboardfactory.Motherboard;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class);

        Monitor theMonitor = container.getBean(Monitor.class);
        Case theCase = container.getBean(Case.class);
        Motherboard theMotherboard = container.getBean(Motherboard.class);

        PC myPC = new PC(theCase,theMonitor,theMotherboard);
        myPC.powerUp();
    }
}
