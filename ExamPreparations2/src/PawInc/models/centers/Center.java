package PawInc.models.centers;

import PawInc.models.animals.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Center {

    private String name;
    private List<Animal> animals;

    public Center(String name) {
        this.name = name;
        this.animals = animals;
    }

    public void register(Animal animal){
        this.animals.add(animal);
    }

    public void registerAll(List<Animal> animals){
        this.animals.addAll(animals);
    }


    public List<Animal> getAnimals(){
        return Collections.unmodifiableList(this.animals);
    }

    public void removeAnimals(List<Animal> animals){
        this.animals.removeAll(animals);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
