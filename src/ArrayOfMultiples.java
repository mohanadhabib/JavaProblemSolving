/*
* A java Program to
* print the array of multiples of
* a number based on the desired length of the array
*/

import java.util.ArrayList;

public class ArrayOfMultiples {
    public static ArrayList<Integer> arrayOfMultiples(int num, int length){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<length;i++){
            arr.add(num * (i+1));
        }
        return arr;
    }
    public static void main(String [] args){
        System.out.println(arrayOfMultiples(7,5)); // output [7, 14, 21, 28, 35]
        System.out.println(arrayOfMultiples(12,10)); // output [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
        System.out.println(arrayOfMultiples(17,6)); // output [17, 34, 51, 68, 85, 102]
    }
}
