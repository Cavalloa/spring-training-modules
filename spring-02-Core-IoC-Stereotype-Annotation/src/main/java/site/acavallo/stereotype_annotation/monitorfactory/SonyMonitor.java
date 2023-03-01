package site.acavallo.stereotype_annotation.monitorfactory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
@Getter
@Setter
public class SonyMonitor extends Monitor{

    public SonyMonitor(String model, String manufacturer, int size) {
        super("25 inch beast","Sony",25);
    }
    public void drawPixelAt() {
        System.out.println("Drawing pixel with Sony");
    }
}
