package com.zaremba;

public class Sorter {

    public static int[] bubbleSort(int[] array){
        for(int i = 0; i < array.length;i++){
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] mergeSort(int[] array) {

        // Recursive control 'if' statement.
        if(array.length <= 1) {

            return array;

        }

        int midpoint = array.length / 2;

        // Declare and initialize left and right arrays.
        int[] left = new int[midpoint];
        int[] right = new int[array.length - midpoint];

        System.arraycopy(array, 0, left, 0, midpoint);
        System.arraycopy(array,midpoint,right,0,midpoint);


        int[] result = new int[array.length];

        // Recursive call for left and right arrays.
        left = mergeSort(left);
        right = mergeSort(right);

        // Get the merged left and right arrays.
        result = merge(left, right);

        // Return the sorted merged array.
        return result;

    }

    // Merges the left and right array in ascending order.
    private static int[] merge(int[] left, int[] right) {

        // Merged result array.
        int[] result = new int[left.length + right.length];

        // Declare and initialize pointers for all arrays.
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        // While there are items in either array...
        while(leftPointer < left.length || rightPointer < right.length) {

            // If there are items in BOTH arrays...
            if(leftPointer < left.length && rightPointer < right.length) {

                // If left item is less than right item...
                if(left[leftPointer] < right[rightPointer]) {

                    result[resultPointer++] = left[leftPointer++];

                } else {

                    result[resultPointer++] = right[rightPointer++];

                }

            }

            // If there are only items in the left array...
            else if(leftPointer < left.length) {

                result[resultPointer++] = left[leftPointer++];

            }

            // If there are only items in the right array...
            else if(rightPointer < right.length) {

                result[resultPointer++] = right[rightPointer++];

            }

        }

        return result;

    }


}
