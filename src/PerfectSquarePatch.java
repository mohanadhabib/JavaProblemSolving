/*
A Program that print the matrix num*num of the given number
and if number = 0
it prints an empty matrix
number should be greater than or equal to zero "positive integer"
*/

public class PerfectSquarePatch {

    public static void squarePatch(int num){
        if(num == 0){
            System.out.println("[]");
        }
        else{
            for(int i=0;i<num;i++){
                System.out.print("[");
                for(int j=0;j<num;j++){
                    if(j==num-1){
                        System.out.print(num);
                    }
                    else{
                        System.out.print(num+",");
                    }
                }
                System.out.println("]");
            }
        }
    }

    public static void main(String [] args){
        squarePatch(3); /* output
                                [3,3,3]
                                [3,3,3]
                                [3,3,3]
                              */
        squarePatch(5); /* output
                                 [5,5,5,5,5]
                                 [5,5,5,5,5]
                                 [5,5,5,5,5]
                                 [5,5,5,5,5]
                                 [5,5,5,5,5]
                              */
        squarePatch(1); /*  output
                                 [1]
                              */
        squarePatch(0); /*  output
                                 []
                             */
    }
}
