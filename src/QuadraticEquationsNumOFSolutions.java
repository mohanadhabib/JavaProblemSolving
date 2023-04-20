/*
* A java Program to check
* the number of real solutions of
* a quadratic Equation
*/
public class QuadraticEquationsNumOFSolutions {
    public static int solutions(int a,int b,int c){
        double x = Math.pow(b, 2) - 4 * a * c;
        if(x >0){
            return 2;
        }
        else if(x <0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
       System.out.println(solutions(1, 0, -1)); //output 2
       System.out.println(solutions(1, 0, 0));  //output 1
       System.out.println(solutions(1, 0, 1));  //output 0
    }
}