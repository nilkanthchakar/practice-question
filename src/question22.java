/*
Write a Java program to compute the average value of an array of integers except the largest
and smallest values
 */

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

public class question22 {

    public static void main(String[] args) {

        int []arr = {21321,456,465,456,465,65,465,465,465,23};

        // Smallest number
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < small){
                small = arr[i];
            }

        }
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > large){
                large = arr[i];
            }

        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != large || arr[i] != small){
                total = total + arr[i];
            }
        }

        System.out.println("Average is : "+total/arr.length);
        System.out.println(small);
        System.out.println(large);

    }
}
