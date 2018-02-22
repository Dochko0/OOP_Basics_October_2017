package FragileBaseClass;

import HierarichalInheritance.Cat;
import HierarichalInheritance.Dog;

public class Main {
    public static void main(String[] args) {

        Predator p = new Predator();
        p.feet(new Food());
        System.out.println(p.getHealth());
        p.eatAll(new Food[]{new Food(), new Food()});
        System.out.println(p.getHealth());
    }
}
