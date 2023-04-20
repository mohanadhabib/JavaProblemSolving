/*
A Program That get the addition of
two strings , convert them into integers
and return the result as a string
*/
public class AddingNumbers {

    public static String add(String st1,String st2){
        int num1,num2,res;
        String result;
        if(st1==null||st1.equals("")||st2==(null)||st2.equals("")){
            result = "Invalid Operation";
        }
        else{
            num1 = Integer.parseInt(st1);
            num2 = Integer.parseInt(st2);
            res = num1+num2;
            result = String.valueOf(res);
        }
        return result;
    }

    public static void main(String [] args){
        System.out.println(add("111", "111"));  //output : 222 "as String"
        System.out.println(add("10", "80"));    //output : 90 "as String"
        System.out.println(add("", "20"));      //output : Invalid Operation
    }
}
