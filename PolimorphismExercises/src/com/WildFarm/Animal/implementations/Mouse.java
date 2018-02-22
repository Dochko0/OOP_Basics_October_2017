package com.WildFarm.Animal.implementations;

import com.WildFarm.Animal.abstractions.Mammal;
import com.WildFarm.Food.Food;

public class Mouse extends Mammal {


    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }


    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }
}
