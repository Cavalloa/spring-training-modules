package site.acavallo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.acavallo.casefactory.Case;
import site.acavallo.config.PcConfig;

public class ComputerTest {

    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        Case theCase = container.getBean(Case.class);

        System.out.println(theCase.getDimensions().getDepth());
    }
}
