package com.Draymond.Adapter.ClassAdapter;

import com.Draymond.Builder.Director;
import com.Draymond.Builder.SubMealBuilderA;
import org.junit.Test;


public class TestAdapter {

    @Test
    public void test(){
        Robot robot=(DogAdapter) new DogAdapter();
        robot.cry();
        robot.move();

    }

}
