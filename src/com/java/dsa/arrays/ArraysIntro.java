package com.java.dsa.arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // Array is the Linear data structure is store multiple similar type of element under single name

        // Declaration
        int[] numbers = new int[5];

        /*
              above array name is numbers and size of array is 5 , it is the int type of array coz it only store the
              integer type of element
         */

        // Initialization
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[3] = 3;

        // Accessing the array element by index
        System.out.println(numbers[1]);

        // Print

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+"\t");
        }

    }
}
