/*
A program to find the index of the first
carriage that have 50% or less
of its maximum capacity
and if not found return -1
*/

public class CrowdedCarriageCapacity {

    public static int findSeat(int num , int[]arr){
        int capacity = num / arr.length;
        int index = -1;
        for (int i=0;i<arr.length;i++){
            if((float) arr[i]/capacity <= 0.5){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String []args){
        int[] arr0 = {3, 5, 4, 2};
        System.out.println(findSeat(20,arr0));    // output : 3
        int[] arr1 = {50, 20, 80, 90, 100, 60, 30, 50, 80, 60};
        System.out.println(findSeat(1000,arr1));  // output : 0
        int[] arr2 = {35, 23, 40, 21, 38};
        System.out.println(findSeat(200,arr2));   // output : -1
    }
}
