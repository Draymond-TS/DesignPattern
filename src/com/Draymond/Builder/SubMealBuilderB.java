package com.Draymond.Builder;

public class SubMealBuilderB extends  MealBuilder {
    @Override
    public void builFood() {
        System.out.println("B for food");
    }

    @Override
    public void builDrink() {
        System.out.println("B for drink");
    }
}
