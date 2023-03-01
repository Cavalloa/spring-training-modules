package site.acavallo.stereotype_annotation.monitorfactory;

import org.springframework.stereotype.Component;

@Component
public class AcerMonitor extends Monitor {

    public AcerMonitor(String model,String manufacturer, int size) {

        super("25 inch beast","Acer",25);
    }

    public void drawPixelAt() {
        System.out.println("Drawing pixel with Sony");
    }
}
