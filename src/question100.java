/*
Write a funcƟon that takes a string as input and returns the number of times that
each character appears in that string.
 */


import java.util.Scanner;

public class question100 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Get the frequency of each character
        int[] frequencies = countCharacterFrequency(input);

        // Print the frequencies
        printCharacterFrequencies(frequencies);

        scanner.close();
    }

    public static int[] countCharacterFrequency(String input) {
        int[] frequencies = new int[256];  // Assuming ASCII character set

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            frequencies[c]++;
            System.out.println("The ascii value of C is :" + (int)c + " the value is "+c);
        }

        return frequencies;
    }

    public static void printCharacterFrequencies(int[] frequencies) {
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > 0) {
                System.out.println("Character '" + (char)i + "' appears " + frequencies[i] + " times.");
            }
        }
    }


}
