/*
 * @(#)SpecialFruitBasket.java 1.0 Sep 17, 2017
 */
package pratyush.util.collection;

import pratyush.object.Apple;

import java.util.ArrayList;

public class SpecialFruitBasket {
    public static void main(String[] args) {

        //add type to list
        ArrayList<Apple> apples = new ArrayList();

        apples.add(new Apple("Fuji"));
        apples.add(new Apple("Gala"));
        apples.add(new Apple("HoneyCrisp"));

//        apples.add(new Orange("Navel Orange"));
//        apples.add(new Orange("Mandarin Orange"));
//        apples.add(new Orange("Blood Orange"));

        for (Apple a : apples){
            System.out.println(a.getType());
        }

    }

}



