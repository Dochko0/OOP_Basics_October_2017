package FragileBaseClass;

import java.util.Collections;
import java.util.List;

public class Animal {

    protected List<Food> foodEaten;

    public Animal(List<Food> foods) {
        this.foodEaten = foods;
    }

    public final void eat(Food food) {
        this.foodEaten.add(food);
    }
    public void eatAll(Food[] foods){
        for (Food food : foods) {
            this.eat(food);
        }
    }
}
