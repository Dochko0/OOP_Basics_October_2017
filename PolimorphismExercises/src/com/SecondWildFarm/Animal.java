package com.SecondWildFarm;

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

    void setFoodEaten(int foodEaten) {
        this.foodEaten += foodEaten;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public String getAnimalType() {
        return this.animalType;
    }

    public double getAnimalWeight() {
        return this.animalWeight;
    }

    public int getFoodEaten() {
        return this.foodEaten;
    }

    abstract void makeSound();
    abstract void eat(Food food);

}
