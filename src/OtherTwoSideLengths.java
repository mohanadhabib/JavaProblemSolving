/*
* A program to get the
* longest and medium length
* sides of 30,60,90 triangle from the smallest side
*/

import java.util.ArrayList;

public class OtherTwoSideLengths {
    public static ArrayList<Float> otherSides(int side){
        ArrayList<Float> arr = new ArrayList<>(2);
        float pi = 3.14F;
        float longestSide,mediumSide,degree = (30*pi)/180;
        longestSide = (float) (side / Math.sin(degree));
        mediumSide  = (float) (side / Math.tan(degree));
        arr.add(longestSide);
        arr.add(mediumSide);
        return arr;
    }
    public static void main(String[] args){
        System.out.println(otherSides(1));  // output : [2.0009198, 1.7331129]
        System.out.println(otherSides(12)); // output : [24.011038, 20.797356]
        System.out.println(otherSides(2));  // output : [4.0018396, 3.4662259]
        System.out.println(otherSides(3));  // output : [6.0027595, 5.199339]
    }
}
