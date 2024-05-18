/*
Write a funcƟon that takes a string as input and checks if the string is a valid binary number.
 */

public class question99 {
    public static void main(String[] args) {
        String str = "1010101010101012";
        int count = 0;
        int i = 0;
        for(i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1' || str.charAt(i) == '0'){
                continue;
            }
            else{

                count++;
                break;
            }


        }


        if(count > 0){
            System.out.print("The presence of : " + str.charAt(i) + "makes this String a invalid binary" + i);
        }




            }

}
