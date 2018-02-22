package com.WildFarm.Animal.abstractions;

import com.WildFarm.Food.Food;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{

    private String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.setLivingRegion(livingRegion);
    }

    @Override
    public void eat(Food food) {
        if ("Vegetable".equals(food.getClass().getSimpleName())) {
            super.setFoodEaten(food.getQuantity());

        } else {
            throw new IllegalArgumentException(String.format("%ss are not eating that type of food!",super.getAnimalType()));
        }
    }

    protected final String getLivingRegion() {
        return this.livingRegion;
    }

    private void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %d]", super.getAnimalType(), super.getAnimalName()
        , new DecimalFormat("#.################").format(super.getAnimalWeight())
                , this.getLivingRegion(), super.getFoodEaten());
    }
}
