/*
*  A java Program to
*  extract and sort the values from map
*  and store it in array
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class ObjectsKeysAndValues {

    public static ArrayList<String> getValues(HashMap<String,String> map){
        ArrayList<String> st = new ArrayList<>(map.values());
        st.sort(Comparator.naturalOrder());
        return st;
    }
    public static void main(String[] args){
       HashMap<String, String> map = new HashMap<>(){};
        map.put("a","Apple");
        map.put("b","Microsoft");
        map.put("c","Google");
       System.out.println(getValues(map)); // output [Apple, Google, Microsoft]
    }
}
