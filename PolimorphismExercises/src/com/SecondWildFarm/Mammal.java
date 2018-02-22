package com.SecondWildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return this.livingRegion;
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %d]", super.getAnimalType(), super.getAnimalName()
                //da se sravni s main
                , new DecimalFormat("#.################").format(super.getAnimalWeight())
                , this.getLivingRegion(), super.getFoodEaten());
    }
}
