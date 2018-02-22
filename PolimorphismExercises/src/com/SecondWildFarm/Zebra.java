package com.SecondWildFarm;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Zs");
    }

    @Override
    void eat(Food food) {
        if (!food.getClass().getSimpleName().equalsIgnoreCase("Vegetable")) {
            System.out.println("Zebra are not eating that type of food!");
            return;
        }

        this.setFoodEaten(food.getQuantity());
    }
}
