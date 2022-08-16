package com.zaremba.recursion;


public class Fibonacci {
    static Integer[]numbers={1,1,2,3,5,8,13,21,34};

    //recursive method to add terms before
    public static int Fibonacci(Integer[] numbers, int n){

        if(n<=0){
            return 0;
        }
        else{
            return  Fibonacci(numbers, n-1 ) + numbers[n-1];
        }
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(numbers,8));
    }

}