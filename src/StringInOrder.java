/*
A program to check
if a string is in order alphabetically
*/

public class StringInOrder {

    public static boolean isInOrder(String st){
        boolean result = false;
        char [] charSt = st.toCharArray();
        for (int i=0;i<charSt.length-1;i++){
            if((int)charSt[i] <= (int)charSt[i+1]){
                result = true;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String [] args){
        System.out.println(isInOrder("abc"));      // true
        System.out.println(isInOrder("edabit"));   // false
        System.out.println(isInOrder("123"));      // true
        System.out.println(isInOrder("xyzz"));     // true
    }
}
