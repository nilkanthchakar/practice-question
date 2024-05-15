/*

Check what is the number of leƩer for "K" String: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Example: for D number should be 4

 */

public class question12 {
    public static void main(String[] args) {
        String str = "ABCDEFFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'K'){
                System.out.print(str.charAt(i) + " " + i);
        }


        }
    }
}
