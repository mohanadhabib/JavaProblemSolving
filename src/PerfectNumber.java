/*
A program to check
the perfect number
"Perfect number is the number that equals to sum of its divisors
 except the number itself"
*/

public class PerfectNumber {

    public static boolean checkPerfect(int num){
        boolean res;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num % i == 0){
                sum+=i;
            }
        }
        res = sum == num;
        return res;
    }

    public static void main(String []args){
        System.out.println(checkPerfect(6));   //true
        System.out.println(checkPerfect(28));  //true
        System.out.println(checkPerfect(496)); //true
        System.out.println(checkPerfect(12));  //false
        System.out.println(checkPerfect(97));  //false
    }
}
