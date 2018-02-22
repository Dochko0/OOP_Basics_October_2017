package com.WildFarm.Animal.implementations;

import com.WildFarm.Animal.abstractions.Felime;
import com.WildFarm.Food.Food;

public class Tiger extends Felime {

    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight,livingRegion);
    }


    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if ("Meat".equals(food.getClass().getSimpleName())) {
            super.setFoodEaten(food.getQuantity());
        } else {
            throw new IllegalArgumentException(String.format("%ss are not eating that type of food!",super.getAnimalType()));
        }
    }
}
