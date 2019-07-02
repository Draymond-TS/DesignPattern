package com.Draymond.Strategy;

public class Hander {
    private Sort sort;

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public void sort() {
        System.out.println("选择排序方法是");
        sort.sort();
    }

}
