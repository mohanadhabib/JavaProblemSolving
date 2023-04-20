/*
 * A program to get the difference
 * between sum of evens and sum of odd numbers
 * in an array of integers
 * if sum of even numbers greater than sum of odds return (sum of even numbers - sum of odd numbers)
 * but if sum of odd numbers greater than sum of evens return (sum of odd numbers - sum of even numbers)
 */

public class WarOfNumbers {

    public static int warOfNumbers (int []arr){
        int sumOfEvens = 0 ,sumOfOdds = 0;
        for(int i : arr){
            if(i%2 == 0){
                sumOfEvens += i;
            }
            else{
                sumOfOdds += i;
            }
        }
        if(sumOfEvens>sumOfOdds){
            return sumOfEvens-sumOfOdds;
        }
        else{
            return sumOfOdds - sumOfEvens;
        }
    }
    public static void main(String []args){
        int []arr1 = {2,8,7,5},arr2 = {12, 90, 75},arr3 = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        System.out.println(warOfNumbers(arr1));  // output : 2
        System.out.println(warOfNumbers(arr2));  // output : 27
        System.out.println(warOfNumbers(arr3));  // output : 168
    }
}
