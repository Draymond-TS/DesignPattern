package com.Draymond.Factory.AbstractFactory;

public class TCLFactory implements  EFactory {
    @Override
    public Televison produceTelevison() {

        return new TCLTelevison();
    }

    @Override
    public AirCondition produceAirCondition() {

        return new TCLAirCondition();
    }
}
