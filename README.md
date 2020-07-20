# encryption_ceaser_cipher
Create and/or decipher Strings using Caesar cipher encryption

<b>CaesarCipher</b> - a program to encrypt a String using a Caesar cipher. Contains the following methods:
* encrypt - has two parameters, a String named input and an int named key. This method returns a String that has been encrypted using the Caesar Cipher algorithm.
  * For example, encrypt(“FIRST LEGION ATTACK EAST FLANK!”, 23) should return the string “CFOPQ IBDFLK XQQXZH BXPQ CIXKH!”
* testCaesar - read a file and encrypt the complete file using the Caesar Cipher algorithm, printing the encrypted message.
* encryptTwoKeys - has three parameters, a String named input, and two integers named key1 and key2. This method returns a String that has been encrypted using the following algorithm. Parameter key1 is used to encrypt every other character with the Caesar Cipher algorithm, starting with the first character, and key2 is used to encrypt every other character, starting with the second character.
  * For example, the call encryptTwoKeys(“First Legion”, 23, 17) should return “Czojq Ivdzle”. Note the ‘F’ is encrypted with key 23, the first ‘i’ with 17, the ‘r’ with 23, and the ‘s’ with 17, etc. Be sure to test this method.

