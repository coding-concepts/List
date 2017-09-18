/*
 * @(#)FruitBasket.java 1.0 Sep 17, 2017
 */
package pratyush.util.collection;

import pratyush.object.Apple;
import pratyush.object.Orange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;

public class FruitBasket {

    public static void main(String[] args) {

        ArrayList apples = new ArrayList();

        LinkedList apples_1 = new LinkedList();

        Vector<Apple> appleV = new Vector<>();

        apples_1.add(new Apple("Fuji"));
        apples_1.add(new Apple("Gala"));
        apples_1.add(new Apple("HoneyCrisp"));



        apples.add(new Apple("Fuji"));
        apples.add(new Apple("Gala"));
        apples.add(new Apple("HoneyCrisp"));

        apples.add(new Orange("Navel Orange"));
        apples.add(new Orange("Mandarin Orange"));
        apples.add(new Orange("Blood Orange"));

        Map m = new HashMap();
        m.put (1, 25);



        for(int i = 0; i < apples.size(); i++){
            System.out.println(   ((Apple)apples.get(i)).getType());
        }

    }

}



