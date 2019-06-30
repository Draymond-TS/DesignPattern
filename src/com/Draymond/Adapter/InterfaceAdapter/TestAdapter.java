package com.Draymond.Adapter.InterfaceAdapter;


import org.junit.Test;

public class TestAdapter {

    @Test
    public void test(){
        DogAdapter dogAdapter=new DogAdapter();
        dogAdapter.run();
        dogAdapter.eat();

    }

}
