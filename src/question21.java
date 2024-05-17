/*
 Write a Java program to test if an array contains a specific value
 */
public class question21 {
    public static void main(String[] args) {
        int []arr = {21321,456,465,456,465,65,465,465,465,23};
        int target = 65;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target){
                System.out.println(i);
            }
        }

    }

}
