/*

Swap without third variable string
 */
import java.util.*;
public class question4 {
    public static void main(String[] args) {

        String a = "Love";
        String b = "You";
        System.out.println("Before swa p: a is " + a + " and b is " + b);

        a = a+b ;
        b = a.substring(0,a.length() - b.length());

        a = a.substring(b.length());


        System.out.println("After swap: a is " + a + " and b is " + b);


    }

//    a = a + b;
//    b = a.substring(0, a.length() - b.length());
//    a = a.substring(b.length());
//        System.out.println("After : " + a + " " + b);


}
