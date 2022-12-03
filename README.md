# Lab4---Security---Caeser-Cipher-Encrypt-Decrypt-Brute-Force

<h2>What is the program?</h2>

This program is a Java code written to apply encryption, decryption, and Brute Force to texts using Caeser Cipher. 

<h2>How the program works?</h2>

The program will require from the user to enter the process he/she wished to do with Caeser Cipher (encrypt, decrypt, or Brute Force)

<h2>Encrypt using Caeser Cipher</h2>

If the user chose encrypt in the program, he/she should enter a text to encrypt. After that, the program requires the user to enter a shift key, possibly from 1 to 25. As a result, the program will return the encrypted text using this key.

<h2>How encryption in Caeser Cipher works?</h2>

The program will read the input string from the user, as well as the shift key chosen. After that, the program will loop over the input string char by char. For each char, the program will find its position in the alphabet, whether lower or upper case. After that, the program will add the shift key to the postion index of the char and do module of 26 to it, which is the total number of alphabets. After getting the new position, the program will check the char alphabet of this position, and then add the char into the encrypted string result. The same procedure will be applied to all chars of the text.

<h2>Decrypt using Ceaser Cipher</h2>

If the user choose decrypt in the program, he/she should enter an encrypted text to decrypt. After that, the program requires the user to enter a shift key, possibly from 1 to 25. As a result, the program will return the decrypted text using this key.

<h2>How decryption in Caeser Cipher works?</h2>

The program will read the input string from the user, as well as the shift key chosen. After that, the program will loop over the input string char by char. For each char, the program will find its position in the alphabet, whether lower or upper case. After that, the program will subtract the shift key from the postion index of the char and do module of 26 to it, which is the total number of alphabets. If the result is negative, the program will add 26 to it to become positive. After getting the new position, the program will check the char alphabet of this position, and then add the char into the decrypted string result. The same procedure will be applied to all chars of the text.

<h2>Brute Force using Caeser Cipher</h2>

If the user chose brute force in the program, he/she should enter an encrypted text. After that, a list of all shift keys (from 1 to 25) and their corresponding decrypted texts will be displayed. The user will see the correct decrypted text, and will know the shift key used for the encryption process.

<h2>How Brute Force using Caeser Cipher works?</h2>

The program will get the encrypted message from the user, and will then loop over all shift keys, from 1 to 25. After that, the program will call the decrypt method to decrypt the message using each key, and will display the result respectively.
