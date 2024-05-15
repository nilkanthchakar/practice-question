/*

Create a code to check the length of a string = "Hi I’m learning in PFE, I will become a
developer". Now if the length is greater than 28 change the string to "I will become a
developer". and print "Successfully changed."

 */
public class question2 {

    public static void main(String[] args) {
        String str = "Hi I’m learning in PFE, I will become a developer";
        if (str.length() > 28 ){
            str = "I will become a developer";
            System.out.println("Successfully changed.");
        }

    }

}
