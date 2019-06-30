package com.Draymond.Builder;

public class SubMealBuilderA extends  MealBuilder {
    @Override
    public void builFood() {
        System.out.println("A for food");
    }

    @Override
    public void builDrink() {
        System.out.println("A for drink");
    }
}
