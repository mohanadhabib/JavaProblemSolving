/*
* A Java Program to get the number of
* occurrences of a key in a given 2d-Array "matrix"
*/
public class CountLettersInAWordSearch {
    public static int letterCounter(char[][]arr,char key){
        int count=0;
        for(char[] x :arr){
            for(char y :x){
                if(y==key){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String []args){
        char [][]arr = {{'D', 'E', 'Y', 'H', 'A', 'D'},
                        {'C', 'B', 'Z', 'Y', 'J', 'K'},
                        {'D', 'B', 'C', 'A', 'M', 'N'},
                        {'F', 'G', 'G', 'R', 'S', 'R'},
                        {'V', 'X', 'H', 'A', 'S', 'S'}};
        System.out.println(letterCounter(arr,'D')); // output : 3
        System.out.println(letterCounter(arr,'H')); // output : 2
    }
}
