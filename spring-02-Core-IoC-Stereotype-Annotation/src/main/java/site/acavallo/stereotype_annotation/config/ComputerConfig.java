package site.acavallo.stereotype_annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import site.acavallo.stereotype_annotation.casefactory.Case;
import site.acavallo.stereotype_annotation.casefactory.DellCase;
import site.acavallo.stereotype_annotation.monitorfactory.*;
import site.acavallo.stereotype_annotation.motherboardfactory.AsusMotherboard;
import site.acavallo.stereotype_annotation.motherboardfactory.Motherboard;
import site.acavallo.stereotype_annotation.casefactory.Case;
import site.acavallo.stereotype_annotation.casefactory.DellCase;
import site.acavallo.stereotype_annotation.monitorfactory.Monitor;
import site.acavallo.stereotype_annotation.monitorfactory.SonyMonitor;
import site.acavallo.stereotype_annotation.motherboardfactory.AsusMotherboard;
import site.acavallo.stereotype_annotation.motherboardfactory.Motherboard;

@Configuration
public class ComputerConfig {
    @Bean(name="sony")
    @Primary
    public Monitor monitorSony(){

        return new SonyMonitor("25 inch Beast","Sony",25);
    }

    @Bean(name="sony2")
    public Monitor monitorSony2(){

        return new SonyMonitor("40 inch Beast","Sony",40);
    }

    @Bean
    //Set to default monitor
    public Monitor monitorAcer(){
        return new AcerMonitor("23 inch Beast","Acer",23);
    }


    @Bean
    public Case caseDell(){
        return new DellCase("220B","Dell","240");
    }

    @Bean
    public Motherboard motherboardAsus(){
        return new AsusMotherboard("BJ-200","Asus",4,6,"v2.44");
    }
}
