package com.zaremba.sets;

import java.util.Comparator;

public class CustomCompare implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.price > o2.price){
            return 1;
        }else if(o1.price < o2.price){
            return -1;
        }
        return 0;
    }
}
