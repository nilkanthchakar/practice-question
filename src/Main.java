import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age : " );
        int a = sc.nextInt();

        if (a > 18){
            System.out.println("You are eligibe for voting");

        }
        else {
            System.out.println("You are not eligible");
        }
    }
}