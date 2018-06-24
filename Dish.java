package ru.wedro22.evojTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Dish {

    public ArrayList<Food> list = new ArrayList<Food>(
            Arrays.asList(new Food[]{
                    new Food(1, 1, 20)
                    ,new Food(5,1,1)
                    ,new Food(1,5,1)
            }));

    public void add(Food f){
        list.add(f);
    }



    public void setProperty(Property property){
        list.get(0).gr=property.get1();
        list.get(1).gr=property.get2();
        list.get(2).gr=property.get3();
    }


    public double getBel() {
        double d=0, mass=0;
        for (Food food : list) {
            d+=food.b/100*food.gr;
            mass+=food.gr;
        }
        return 100*d/mass;
    }


    public double getZh() {
        double d=0, mass=0;
        for (Food food : list) {
            d+=food.z/100*food.gr;
            mass+=food.gr;
        }
        return 100*d/mass;
    }


    public double getUg() {
        double d=0, mass=0;
        for (Food food : list) {
            d+=food.u/100*food.gr;
            mass+=food.gr;
        }
        return 100*d/mass;
    }
}
