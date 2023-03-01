package site.acavallo.stereotype_annotation.casefactory;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class DellCase extends Case {

    public DellCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer, powerSupply);
        }

    @Override
    public void pressPowerButton() {
        System.out.println("You pressed the power button.");

    }
}
