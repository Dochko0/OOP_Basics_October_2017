package com.WildFarm;

import com.WildFarm.Animal.abstractions.Animal;
import com.WildFarm.Animal.factories.AnimalFactory;
import com.WildFarm.Animal.factories.FoodFactory;
import com.WildFarm.Food.Food;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String line="";
        AnimalFactory factory = new AnimalFactory();
        FoodFactory foodFactory=new FoodFactory();
        while(!"End".equals(line=bf.readLine())){
            String[] animalTokens = line.split(" ");
            Animal animal = factory.getAnimal(animalTokens);
            String[] foodTokens = bf.readLine().split(" ");
            Food food = foodFactory.getFood(foodTokens);
            animal.makeSound();
            try {
                animal.eat(food);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            System.out.println(animal);
        }


    }
}
