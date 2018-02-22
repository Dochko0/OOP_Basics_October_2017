package com.WildFarm.Animal.abstractions;

import com.WildFarm.Food.Food;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    public Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    protected final String getAnimalName() {
        return this.animalName;
    }

    protected final String getAnimalType() {
        return this.animalType;
    }

    protected final double getAnimalWeight() {
        return this.animalWeight;
    }

    protected final int getFoodEaten() {
        return this.foodEaten;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }
}
