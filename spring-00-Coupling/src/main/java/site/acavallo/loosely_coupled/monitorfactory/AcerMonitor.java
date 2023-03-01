package site.acavallo.loosely_coupled.monitorfactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AcerMonitor extends Monitor {

    public AcerMonitor(String model, String manufacturer, int size) {
        super(model, manufacturer, size);
    }

    public void drawPixelAt() {
        System.out.println("Drawing pixel with Acer");
    }


}
