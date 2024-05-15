/*
******
******
******
******

 */
public class Pattern {

//    public static void main(String[] args) {
//        for (int i = 1; i <= 4; i++) {
//            System.out.println("******");
//        }
//    }


//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            //System.out.println(i);
//            for (int j = 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++){
//            for (int j = (5-i); j > 0 ; j--){
//                System.out.print(" ");
//            }
//            for(int j = i; j >= 0 ; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//
//
//        }
//    }


    public static void main(String[] args) {
        int count = 1;
        for(int i = 0; i < 5; i ++){
            for (int j = (5-i); j > 0 ; j--){
                System.out.print(" ");
           }
            for(int j = 0; j < count; j++){
                System.out.print(i+1);

            }
            System.out.println();
            count+=2;

        }
    }
}
