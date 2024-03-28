package com.cydeo.tightly_coupled;

public class Main {

    public static void main(String[] args) {

        AcerMonitor theMonitor = new AcerMonitor("25 inch Beast", "Acer", 25);
        DellCase theCase = new DellCase("15AK", "Dell", "15");
        AsusMotherboard theMotherboard = new AsusMotherboard("AS-18", "Asus", 3, 4,"v-12");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        // this whole structure is tightly coupled! to be able to add new components, there
        // will be too many fields to change which will be a huge problem when there are too many class etc...
    }
}
