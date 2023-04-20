/*
A program that fill a 2d array with zeros
Then fill the diagonals with ones
Then return number of cells not on a diagonal " the zeroed elements " (empty squares)
*/

import java.util.Arrays;

public class EmptySquareSequence {

    public static int emptySq(int step){
        int size = step*2,count = 0;
        int [][] arr = new int[size][size];
        for(int i=0;i<size;i++){
            Arrays.fill(arr[i],0);
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j|| j==size-1-i){
                    arr[i][j]=1;
                }
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[i][j]==0) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String [] args){
        System.out.println(emptySq(1));  // 0
        System.out.println(emptySq(3));  // 24
        System.out.println(emptySq(10)); // 360
    }
}
