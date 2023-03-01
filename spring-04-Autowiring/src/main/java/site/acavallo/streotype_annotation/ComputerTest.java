package site.acavallo.streotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.acavallo.streotype_annotation.config.PcConfig;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container =new AnnotationConfigApplicationContext(PcConfig.class);

        PC myPc = container.getBean(PC.class);

        System.out.println(myPc.getTheCase().getDimensions().getDepth());
    }
}
