package ru.wedro22.evojTest;

import net.sourceforge.evoj.GenePool;
import net.sourceforge.evoj.core.DefaultPoolFactory;
import net.sourceforge.evoj.handlers.DefaultHandler;

public class EvoJTest {

    public static void main(String[] args){
        new EvoJTest().run();
    }

    private void run() {


        DefaultPoolFactory pf = new DefaultPoolFactory();
        GenePool<Property> pool = pf.createPool(20, Property.class, null);
        DefaultHandler handler = new DefaultHandler(new Rating(),
                null, null, null);
        handler.iterate(pool, 200);
        Property prop = pool.getBestSolution();


        Dish d = new Dish();
        d.setProperty(prop);
        System.out.println(d.getBel()+" "+d.getZh()+" "+d.getUg());
    }
}

