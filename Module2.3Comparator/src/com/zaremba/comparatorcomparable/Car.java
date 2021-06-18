package com.zaremba.comparatorcomparable;

public class Car implements Comparable<Car>{
    int id;
    double price;

    public Car(int id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        if(this.price > o.price){
            return 1;
        }
        else if(this.price < o.price){
            return -1;
        }
        return 0;
    }

    public String toString(){
        return "id" + id + "\tPrice: " + price;
    }
}
