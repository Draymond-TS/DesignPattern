package com.Draymond.Strategy;

import org.junit.Test;

public class TestStrategy  {
    @Test
    public void testStrategy(){
        Sort sort=new BubbleSort();
        Hander hander=new Hander();
        hander.setSort(sort);
        hander.sort();
    }
}
