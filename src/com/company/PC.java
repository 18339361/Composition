package com.company;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
//        fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }
//    DO NOT NEED GETTERS AS WE ARE ACCESSING USING THE VARIABLE NAME
//    AND NO OTHER VALIDATION NEEDS TO BE DONE.
//    EG. monitor.drawPixelAt(1200, 50, "yellow"); IS USING THE
//    VARIABLE MONITOR

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
