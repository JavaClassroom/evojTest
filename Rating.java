package ru.wedro22.evojTest;

import net.sourceforge.evoj.strategies.sorting.AbstractSimpleRating;

public class Rating extends AbstractSimpleRating<Property, Double> {

    public double calcFunction(Property prop, Dish d){
        d.setProperty(prop);
        double b=d.getBel();
        double z=d.getZh();
        double u=d.getUg();
        double bu=((b*4d>u)? u/4d*b : b*4d/u);
        double zu=((z*4d>u)? u/4d*z : z*4d/u);
        return bu*zu;
    }


    @Override
    protected Double doCalcRating(Property prop) {
        double fn=calcFunction(prop, new Dish());
        return -1/fn;
    }
}
