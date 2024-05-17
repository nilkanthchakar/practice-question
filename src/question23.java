/*

 Write a Java program to convert minutes into a number of years and days. Test Data Input
the number of minutes: 3456789 Expected Output : 3456789 minutes is approximately 6
years and 210 days

 */

import java.util.Scanner;

public class question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of minutes: ");
        int minutes = sc.nextInt();

        int years = minutes / 525600;
        minutes = minutes % 525600;
        int days = minutes / 1440;


        System.out.println("The number of years is : " + years + "\nThe number of days is : " + days);



    }
}
