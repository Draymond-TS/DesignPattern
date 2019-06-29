package com.Draymond.Factory.AbstractFactory;

public class TCLAirCondition implements AirCondition {
    @Override
    public void changeTemperature() {
        System.out.println("TCL空调在调温度");
    }
}

