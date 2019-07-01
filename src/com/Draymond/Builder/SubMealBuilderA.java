package com.Draymond.Builder;

public class SubMealBuilderA extends  MealBuilder {
    @Override
    public void builFood() {
        meal.setFood("A Food");
    }

    @Override
    public void builDrink() {
        meal.setFood("A Drink");
    }
}
