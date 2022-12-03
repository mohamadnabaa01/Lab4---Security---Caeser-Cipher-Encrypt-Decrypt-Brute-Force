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
            // get the current char from inputString at index 1
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

    public static String decryptString(String inputString, int shiftKey) {
        // this will be the resulted decrypted string
        String decryptedString = "";

        for (int i = 0; i < inputString.length(); i++) {
            // get the current char from inputString at index 1
            char currentChar = inputString.charAt(i);

            // check if the current char is letter and not capitalized
            if (currentChar >= 'a' && currentChar <= 'z') {

                // get the index of the position of the char in the alphabet sequence
                int alphabetposition = AlphabetCaeserLowerCase.indexOf(currentChar);

                // calculate the dectypred postion of the char, it is the subtraction of the
                // shift key from the alphabet position module 26, the total number of alphabets
                int decryptPosition = (alphabetposition - shiftKey) % 26;

                // get the char of the decrypted position from the lower case alphabet caeser
                // above
                char decryptChar = AlphabetCaeserLowerCase.charAt(decryptPosition);

                // add the encrypted char to the string decryptedstring
                decryptedString += decryptChar;
            }
            // if the currentChar is capital letter
            else if (currentChar >= 'A' && currentChar <= 'Z') {

                // get the index of the position of the char in the upper case alphabet
                int alphabetposition = AlphabetCaeserUpperCase.indexOf(currentChar);

                // calculate the decrypted postion of the char, it is the subtraction of the
                // shift key from the alphabet position module 26, the total number of alphabets
                int decryptPosition = (alphabetposition - shiftKey) % 26;

                // get the char of the decrypted position from the upper case alphabet caeser
                // above
                char decryptChar = AlphabetCaeserUpperCase.charAt(decryptPosition);

                // add the decrypted char to the string decryptedstring
                decryptedString += decryptChar;
            }
            // if the currentChar is not a letter
            else {

                // add the current char as it is to the decrypted string
                decryptedString += currentChar;
            }
        }

        // return the result encrypted string of the text inputString
        return decryptedString;
    }

    public static void main(String[] args) {
        System.out.println("What do you want to do? Encrypt / Decrypt / Brute Force");
        Scanner scan = new Scanner(System.in);
        String inputAction = scan.nextLine();

        // check if the input entered by the user is encrypt to proceed with encryption
        if (inputAction.equalsIgnoreCase("Encrypt")) {

            // ask for text to encrypt
            System.out.println("Please enter a text to encrypt:");
            String inputString = scan.nextLine();

            // ask for shift key for encryption
            System.out.println("Please enter a shift key for encryption:");
            int shiftKey = scan.nextInt();

            // get encrypted string result
            String encryptString = encryptString(inputString, shiftKey);
            System.out.println("The encrypted string is:");
            System.out.println(encryptString);
        }

        // check if the input entered by the user is decrypt to proceed with decryption
        if (inputAction.equalsIgnoreCase("Decrypt")) {

            // ask for text to decrypt
            System.out.println("Please enter a text to decrypt");
            String inputString = scan.nextLine();

            // ask for shift key for decryption
            System.out.println("Please enter a shift key for decryption");
            int shiftKey = scan.nextInt();

            // get decrypted result
            String decryptString = decryptString(inputString, shiftKey);
            System.out.println("The decrypted string is:");
            System.out.println(decryptString);
        }

        scan.close();

    }
}