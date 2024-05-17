/*
Write a Java program to break an integer into a sequence of individual digits. Test Data Input
six non-negaƟve digits: 123456 Expected Output : 1 2 3 4 5 6

 */

public class question24 {

    public static int calci(int a){
        int b = 0;

        for (int i = 1; i > 0; i = a % 10) {
            System.out.println(i);
            b++;
            a = a/10;
        }

        return b;
    }

    public static void main(String[] args) {
        int a = 123456;


//        for (int i = 1; i > 0; i = a % 10){
//            System.out.println(i);
//            a = a / 10;
//        }
        System.out.println("total numbers : " + calci(a));
        int i = 1;
        while(a > 0){
            i = a % 10;
            //System.out.println(i);
            a = a / 10;
        }



    }

}
