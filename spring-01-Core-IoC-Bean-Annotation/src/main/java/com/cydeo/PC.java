package com.cydeo;

import com.cydeo.casefactory.Case;
import com.cydeo.monitorfactory.Monitor;
import com.cydeo.motherboardfactory.Motherboard;

public class PC {

    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // fancy graphs
        theMonitor.drawPixelAt();
    }

}
