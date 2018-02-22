package com.WildFarm.Animal.factories;

import com.WildFarm.Animal.abstractions.Felime;
import com.WildFarm.Food.Food;
import com.WildFarm.Food.Meat;
import com.WildFarm.Food.Vegetable;

public class FoodFactory {

    public Food getFood(String[] tokens) {
        String type = tokens[0];
        int quantity = Integer.parseInt(tokens[1]);
        switch (type.toLowerCase()) {
            case "vegetable":
                return new Vegetable(quantity);
            case "meat":
                return new Meat(quantity);
            default:
                return null;
        }
    }
}
