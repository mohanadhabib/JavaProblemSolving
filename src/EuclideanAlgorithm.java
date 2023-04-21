/*
A program to find
the GCD "Greatest Common Divisor" of two numbers
using Euclidean Algorithm
*/

public class EuclideanAlgorithm {

    public static int euclidean(int a, int b){
        int r = a % b;
        if(r==0){
            return b;
        }
        else{
            return euclidean(b,r);
        }
    }

    public static void main(String [] args){
        System.out.println(euclidean(8, 6));   //2
        System.out.println(euclidean(25, 5));  //5
        System.out.println(euclidean(49, 14)); //7
    }
}
