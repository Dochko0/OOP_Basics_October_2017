package PawInc.models.centers;

import PawInc.models.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class CleansingCenter extends Center {

    public CleansingCenter(String name) {
        super(name);
    }

//    public List<Animal> cleanse() {
//        List<Animal> cleansed = new ArrayList<>();
//        super.getAnimals().stream().forEach(a -> {
//            a.cleance();
//            cleansed.add(a);
//        });
//        super.removeAnimals(cleansed);
//        return cleansed;
//    }
}
