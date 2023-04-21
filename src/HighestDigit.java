/*
A program to find
the highest digit
of a given number
*/

public class HighestDigit {

    public static int highestDigit(int number){
        int res;
        String stNumber = String.valueOf(number);
        char result = stNumber.charAt(0);
        for(int i=1;i<stNumber.length();i++){
            if(stNumber.charAt(i)>result){
                result = stNumber.charAt(i);
            }
        }
        res = Integer.parseInt(String.valueOf(result));
        return res;
    }

    public static void main(String []args){
        System.out.println(highestDigit(4666));    // 6
        System.out.println(highestDigit(544));     // 5
        System.out.println(highestDigit(379));     // 9
        System.out.println(highestDigit(2));       // 2
        System.out.println(highestDigit(377401));  // 7
    }
}
