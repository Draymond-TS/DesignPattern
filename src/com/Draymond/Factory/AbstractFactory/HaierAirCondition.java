package com.Draymond.Factory.AbstractFactory;

public class HaierAirCondition implements AirCondition {
    @Override
    public void changeTemperature() {
        System.out.println("海尔空调在调温度");
    }
}
