/*
A Java Program to
count the number of digits in
a given number
by loops using count() function and
by recursion using countRecursive() function
*/

public class IntegerDigitsCount {

    public static int count(int number){
        int newNumber=number,count =1;
        while(newNumber /10 !=0){
            count++;
            newNumber /=10 ;
        }
        return count;
    }

    public static int countRecursive(int number, int count){
        if(number==0){
            return 0;
        }else{
            return 1+countRecursive(number/10,count);
        }

    }
    public static void main(String []args){
        System.out.println(countRecursive(4666,0));        //output : 4
        System.out.println(count(544));                          //output : 3
        System.out.println(countRecursive(318,0));         //output : 3
        System.out.println(count(-92563));                       //output : 5
        System.out.println(countRecursive(-314890,0));     //output : 6
        System.out.println(count(654321));                       //output : 6
        System.out.println(countRecursive(638476,0));      //output : 6
        System.out.println(count(0));                            //output : 1
    }
}
