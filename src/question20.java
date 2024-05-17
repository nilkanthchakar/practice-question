/*
Write a Java program to calculate the average value of array elements

 */
public class question20 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,897,65,4135,456,4,2,1324,546};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];

        }

        System.out.println(total);

            }
}
