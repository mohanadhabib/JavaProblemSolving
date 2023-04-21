/*
A program that
find the reverse of a given string recursively
*/

public class ReverseAStringByRecursion {

    public static String reverse(String st,int size){
        if(size == 0){
            return "";
        }
        else{
            return st.charAt(size-1)+reverse(st,size-1);
        }
    }

    public static void main(String [] args){
        System.out.println(reverse("hello","hello".length()));
        // output: "olleh"
        System.out.println(reverse("world","world".length()));
        // output: "dlrow"
        System.out.println(reverse("a","a".length()));
        // output: "a"
        System.out.println(reverse("","".length()));
        // output: ""
    }
}
