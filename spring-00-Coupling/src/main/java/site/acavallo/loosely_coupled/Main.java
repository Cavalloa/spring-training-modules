package site.acavallo.loosely_coupled;

import site.acavallo.loosely_coupled.casefactory.Case;
import site.acavallo.loosely_coupled.casefactory.DellCase;
import site.acavallo.loosely_coupled.monitorfactory.AcerMonitor;
import site.acavallo.loosely_coupled.monitorfactory.Monitor;
import site.acavallo.loosely_coupled.motherboardfactory.AsusMotherboard;
import site.acavallo.loosely_coupled.motherboardfactory.Motherboard;


public class Main {
    public static void main(String[] args) {

        Monitor theMonitor = new AcerMonitor("27inch Beast", "Acer", 27);
        Case theCase = new DellCase("220B", "Dell", "240");
        Motherboard theMotherboard = new AsusMotherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC myPc = new PC(theCase,theMonitor,theMotherboard);

        myPc.powerUp();


    }
}
