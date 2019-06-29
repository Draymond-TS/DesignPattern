package com.Draymond.Factory.AbstractFactory;

public class HaierFactory implements  EFactory {
    @Override
    public Televison produceTelevison() {
        return new HaierTelevison();
    }

    @Override
    public AirCondition produceAirCondition() {
        return new HaierAirCondition();
    }
}
