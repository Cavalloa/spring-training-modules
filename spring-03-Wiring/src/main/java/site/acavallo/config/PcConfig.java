package site.acavallo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.acavallo.casefactory.Case;
import site.acavallo.casefactory.DellCase;
import site.acavallo.casefactory.Dimensions;

@Configuration
public class PcConfig {

    @Bean
    public Dimensions dimensions(){
        return new Dimensions(50,10,10);
    }

    @Bean
    public Case caseDell(Dimensions dimensions){
        return new DellCase("220B","Dell","240",dimensions);
    }
}
