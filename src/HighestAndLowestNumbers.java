/*
A program to find
highest and lowest
numbers in a given string
contains numbers divided by space
and return a string of high value and low value split by space
*/

public class HighestAndLowestNumbers {

    public static String highLow(String numbers){
        String[] arr = numbers.split(" ");
        int[] num = new int[arr.length];
        String result;
        int high,low;
        for(int i=0;i<arr.length;i++){
            num[i] = Integer.parseInt(arr[i]);
        }
        high = low = num[0];
        for(int i : num){
            if(i > high){
                high = i;
            }
            else if (i < low){
                low = i;
            }
        }
        result = high + " " + low;
        return result;
    }

    public static void main(String []args){
        System.out.println(highLow("1 2 3 4 5"));  // 5 1
        System.out.println(highLow("1 2 -3 4 5")); // 5 -3
        System.out.println(highLow("1 9 3 4 -5")); // 9 -5
        System.out.println(highLow("13"));         // 13 13
    }
}
