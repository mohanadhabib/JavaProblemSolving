/*
* A program
* to get the real solution
* of a Quadratic Equation
* using Java
*/

public class QuadraticEquation {
    public static int quadraticEquation(int a ,int b,int c){
        int x,result;
        x = (int) Math.sqrt((Math.pow(b,2)-4*a*c));
        result = (-b + x )/(2*a);
        return result;
    }
    public static void main(String []args){
        System.out.println(quadraticEquation(1, 2, -3));      //output : 1
        System.out.println(quadraticEquation(2, -7, 3));      //output : 3
        System.out.println(quadraticEquation(1, -12, -28));   //output : 14
    }
}
