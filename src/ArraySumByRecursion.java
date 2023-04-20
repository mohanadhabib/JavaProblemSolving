/*
* A Java Program to
* Calculate the sum of an integer Array
* By Using Recursion
*/
public class ArraySumByRecursion {

    public static int sum(int []arr,int size){
        if(size == 0 ){
            return 0;
        }else {
            return arr[size-1]+sum(arr,size-1);
        }
    }
    public static void main(String[]args){
        int []arr0 = {1,2,3,4};
        System.out.println(sum(arr0,arr0.length)); //output : 10
        int []arr1 = {1,2};
        System.out.println(sum(arr1,arr1.length)); //output : 3
        int []arr2 = {1};
        System.out.println(sum(arr2,arr2.length)); //output : 1
        int []arr3 = {};
        System.out.println(sum(arr3,arr3.length)); //output : 0
    }
}
