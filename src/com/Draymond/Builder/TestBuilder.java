package com.Draymond.Builder;

import com.Draymond.Factory.AbstractFactory.EFactory;
import com.Draymond.Factory.AbstractFactory.HaierFactory;
import com.Draymond.Factory.AbstractFactory.TCLFactory;
import org.junit.Test;


public class TestBuilder {

    @Test
    public void test(){
         SubMealBuilderA subMealBuilderA=new SubMealBuilderA();
        Director director=new Director( subMealBuilderA);
         director.construct();
    }

}
