package com.Draymond.Adapter.ObjectAdapter;


import org.junit.Test;


public class TestAdapter {

    @Test
    public void test(){
        Robot robot=(DogAdapter) new DogAdapter(new Dog());
        robot.cry();
        robot.move();

    }

}
