package site.acavallo.stereotype_annotation;

import lombok.Getter;
import site.acavallo.stereotype_annotation.casefactory.Case;
import site.acavallo.stereotype_annotation.monitorfactory.Monitor;
import site.acavallo.stereotype_annotation.motherboardfactory.Motherboard;

@Getter
public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt();
    }

}
