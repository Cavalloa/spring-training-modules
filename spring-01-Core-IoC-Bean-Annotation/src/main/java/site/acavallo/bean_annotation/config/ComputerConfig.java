package site.acavallo.bean_annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.acavallo.bean_annotation.casefactory.Case;
import site.acavallo.bean_annotation.casefactory.DellCase;
import site.acavallo.bean_annotation.monitorfactory.Monitor;
import site.acavallo.bean_annotation.monitorfactory.SonyMonitor;
import site.acavallo.bean_annotation.motherboardfactory.AsusMotherboard;
import site.acavallo.bean_annotation.motherboardfactory.Motherboard;

@Configuration
public class ComputerConfig {
    @Bean
    public Monitor monitorSony() {
        return new SonyMonitor("25 inch beast","Acer",25);
    }
    @Bean
    public Case caseDell() {
        return new DellCase("220B","Dell","240");
    }
    @Bean
    public Motherboard motherboardAsus() {
        return new AsusMotherboard("BJ-200","Asus",4,6,"v2.44");
    }


}
