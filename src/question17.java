/*
Write a program to find the factorial value of any number entered through the keyboard.
(Using for and while)
 */

import java.util.Scanner;

public class question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find : ");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = i * fact;

        }

        System.out.println("The factorial of " + n + " is " + fact);
    }
}
