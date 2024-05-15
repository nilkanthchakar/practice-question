/*
Change two strings with using third variable
*/
public class question3 {
    public static void main(String[] args) {
        String str1 = "String 1 ";
        String str2 = "String 2 ";
        String str3 = str1;
        str1 = str2;
        str2 = str3;
        System.out.println(str1);
        System.out.println(str2);
    }
}
