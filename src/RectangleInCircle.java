/*
A program to check Whether
a rectangle with given width and height
can be fit into a circle with given radius
*/

public class RectangleInCircle {

    public static boolean rectangleInCircle(int width,int height,int radius){
        boolean res;
        float diagonal = (float) Math.sqrt((Math.pow(width,2)+Math.pow(height,2)));
        res = diagonal <= radius * 2;
        return res;
    }
    public static void main(String [] args){
        System.out.println(rectangleInCircle(8, 6, 5)); //true
        System.out.println(rectangleInCircle(5, 9, 5)); //false
        System.out.println(rectangleInCircle(4, 7, 4)); //false
    }
}
