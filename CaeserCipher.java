import java.util.Scanner;

public class CaeserCipher {

    // this is the alphabet string of caeser cipher, it contains all characters of
    // the alphabet from a to z
    public static final String AlphabetCaeserLowerCase = "abcdefghijklmnopqrstuvwxyz";

    // this is the alphabet string of caeser cipher of capital letters, it contains
    // all capital characters from the alphaber a to z
    public static final String AlphabetCaeserUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encryptString(String inputString, int shiftKey) {
        // this is the encrypted string
        String encryptedString = "";

        for (int i = 0; i < inputString.length(); i++) {
            // if the char selected from inputString is not capitalized
            char currentChar = inputString.charAt(i);

            // check if the current char is a letter and not capital
            if (currentChar >= 'a' && currentChar <= 'z') {

                // get the index of the position of the char in the alphabet sequence
                int alphabetposition = AlphabetCaeserLowerCase.indexOf(currentChar);

                // calculate the encrypted postion of the char, it is the sum of the shift key
                // and the alphabet position module 26, the total number of alphabets
                int encryptPosition = (shiftKey + alphabetposition) % 26;

                // get the char of the encrypted position from the lower case alphabet caeser
                // above
                char encryptChar = AlphabetCaeserLowerCase.charAt(encryptPosition);

                // add the encrypted char to the string encryptedstring
                encryptedString += encryptChar;
            }
            // if the currentChar is capital letter
            else if (currentChar >= 'A' && currentChar <= 'Z') {

                // get the index of the position of the char in the upper case alphabet
                int alphabetposition = AlphabetCaeserUpperCase.indexOf(currentChar);

                // calculate the encrypted postion of the char, it is the sum of the shift key
                // and the alphabet position module 26, the total number of alphabets
                int encryptPosition = (shiftKey + alphabetposition) % 26;

                // get the char of the encrypted position from the upper case alphabet caeser
                // above
                char encryptChar = AlphabetCaeserUpperCase.charAt(encryptPosition);

                // add the encrypted char to the string encryptedstring
                encryptedString += encryptChar;
            }
            // if the currentChar is not a letter
            else {

                // add the current char as it is to the encrypted string
                encryptedString += currentChar;
            }
        }

        // return the result encrypted string of the text inputString
        return encryptedString;
    }

    public static String 

    public static void main(String[] args) {
        System.out.println("What do you want to do? Encrypt / Decrypt / Brute Force");
        Scanner scan = new Scanner(System.in);
        String inputAction = scan.nextLine();
        if (inputAction.equalsIgnoreCase("Encrypt")) {
            System.out.println("Please enter a text to encrypt:");
            String inputString = scan.nextLine();
            System.out.println("Please enter a shift key for encryption:");
            int shiftKey = scan.nextInt();
            String encrypString = encryptString(inputString, shiftKey);
            System.out.println("The encrypted string is:");
            System.out.println(encrypString);
        }

        scan.close();

    }
}