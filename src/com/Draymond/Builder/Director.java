package com.Draymond.Builder;

public class Director {
    private MealBuilder mealBuilder;

    public Director(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct(){
        mealBuilder.builDrink();
        mealBuilder.builFood();
        return mealBuilder.getMeal();
    }
}
