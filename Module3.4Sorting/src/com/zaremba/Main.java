package com.zaremba;

public class Main {

    public static void main(String[] args) {
        int length = 100000;
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10000);
        }
        int[] numbers2 = new int[length];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = (int)(Math.random() * 10000);
        }
        int[] numbers3 = new int[length];
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = (int)(Math.random() * 10000);
        }
        int[] numbers4 = new int[length];
        for (int i = 0; i < numbers4.length; i++) {
            numbers4[i] = (int)(Math.random() * 10000);
        }
        System.out.println("Starting Sorts");
        long start = System.nanoTime();
        numbers = Sorter.bubbleSort(numbers);
        numbers2 = Sorter.bubbleSort(numbers2);
        long end = System.nanoTime();
        System.out.println("Bubble: " + (end - start) / 1000000.00);
        start = System.nanoTime();
        numbers3 = Sorter.mergeSort(numbers3);
        numbers4 = Sorter.mergeSort(numbers4);
        end = System.nanoTime();
        System.out.println("Merge: " + (end - start) / 1000000.00);
    }


}
