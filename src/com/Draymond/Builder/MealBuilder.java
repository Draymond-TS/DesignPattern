package com.Draymond.Builder;

public abstract  class MealBuilder {
  protected  Meal meal= new Meal();

  public abstract void builFood();
  public abstract  void builDrink();
  public Meal getMeal(){
      return  meal;
  };
}
