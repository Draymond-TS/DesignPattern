package com.Draymond.Builder;

public class SubMealBuilderB extends  MealBuilder {
    @Override
    public void builFood() {
        meal.setFood("B Food");
    }

    @Override
    public void builDrink() {
        meal.setFood("B Drink");
    }
}
