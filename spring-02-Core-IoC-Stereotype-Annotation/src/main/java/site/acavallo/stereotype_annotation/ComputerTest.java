package site.acavallo.stereotype_annotation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.acavallo.stereotype_annotation.casefactory.Case;
import site.acavallo.stereotype_annotation.casefactory.DellCase;
import site.acavallo.stereotype_annotation.config.ComputerConfig;
import site.acavallo.stereotype_annotation.config.PcConfig;
import site.acavallo.stereotype_annotation.monitorfactory.Monitor;
import site.acavallo.stereotype_annotation.monitorfactory.SonyMonitor;
import site.acavallo.stereotype_annotation.motherboardfactory.AsusMotherboard;
import site.acavallo.stereotype_annotation.motherboardfactory.Motherboard;

public class ComputerTest {
    public static void main(String[] args) {
        //Creates a container via application context.
        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        Monitor theMonitor = container.getBean(Monitor.class);
        System.out.println(theMonitor.getSize());




    }
}
