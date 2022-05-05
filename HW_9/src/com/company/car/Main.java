package com.company.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarModel("Infiniti FX50S");
        Engine engine = new Engine();
        engine.setModel("Infiniti");
        engine.setCylinders(8);
        car.setEngine(engine);
        Transmission transmission = new Transmission();
        transmission.setCountTransmission(0);
        transmission.setTypeTransmission("Auto");
        car.setTransmission(transmission);
        Wheels wheels1 = new Wheels();
        Wheels wheels2 = new Wheels();
        Wheels wheels3 = new Wheels();
        Wheels wheels4 = new Wheels();
        Wheels[] wheelsList = {wheels1, wheels2, wheels3, wheels4};
        for (int i = 0; i < wheelsList.length; i++) {
            wheelsList[i].setColor("Black");
            wheelsList[i].setModel("Infiniti");
            wheelsList[i].setSeason("Summer");
        }
        car.setWheels(wheelsList);
    }
}
