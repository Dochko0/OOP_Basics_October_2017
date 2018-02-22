package com.WildFarm.Animal.factories;

import com.WildFarm.Animal.abstractions.Animal;
import com.WildFarm.Animal.implementations.Cat;
import com.WildFarm.Animal.implementations.Mouse;
import com.WildFarm.Animal.implementations.Tiger;
import com.WildFarm.Animal.implementations.Zebra;

public class AnimalFactory {

    public Animal getAnimal(String[] tokens) {

        String type = tokens[0];
        String animalName = tokens[1];
        double animalWeight = Double.parseDouble(tokens[2]);
        String livingRegion = tokens[3];
        switch (type.toLowerCase()) {
            case "cat":
                String catBreed = tokens[4];
                return new Cat(animalName, type, animalWeight, livingRegion,catBreed);
            case "mouse":
                return new Mouse(animalName,type,animalWeight,livingRegion);
            case "zebra":
                return new Zebra(animalName,type,animalWeight,livingRegion);
            case "tiger":
                return new Tiger(animalName,type,animalWeight,livingRegion);
            default:
                return null;
        }
    }
}
