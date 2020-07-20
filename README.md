# encryption_caeser_cipher
Create and/or decipher Strings using Caesar cipher encryption

## Implementing the CaesarCipher

<b>WordPlay</b> - a program to transform words from a file into another form, such as replacing vowels with an asterix. Contains the following methods:
* <b>isVowel</b> - has one Char parameter named ch. This method returns true if ch is a vowel (one of 'a', 'e', 'i', 'o', or 'u' or the uppercase versions) and false otherwise.
* <b>replaceVowels</b> - has two parameters, a String named phrase and a Char named ch. Returns a String that is the string phrase with all the vowels (uppercase or lowercase) replaced by ch. 
  * For example, the call replaceVowels(“Hello World”, ‘*’) returns the string “H*ll* W*rld”. 
* <b>emphasize</b> - has two parameters, a String named phrase and a character named ch. Returns a String that is the string phrase but with the Char ch (upper- or lowercase) replaced by ‘*’ if it is in an odd number location in the string (e.g. the first character has an odd number location but an even index, it is at index 0), or ‘+’ if it is in an even number location in the string (e.g. the second character has an even number location but an odd index, it is at index 1).
  * For example, the call emphasize(“dna ctgaaactga”, ‘a’) would return the string “dn* ctg+*+ctg+”, and the call emphasize(“Mary Bella Abracadabra”, ‘a’) would return the string “M+ry Bell+ +br*c*d*br+”.

<b>CaesarCipher</b> - a program to encrypt a String using a Caesar cipher. Contains the following methods:
* <b>encrypt</b> - has two parameters, a String named input and an int named key. This method returns a String that has been encrypted using the Caesar Cipher algorithm.
  * For example, encrypt(“FIRST LEGION ATTACK EAST FLANK!”, 23) should return the string “CFOPQ IBDFLK XQQXZH BXPQ CIXKH!”
* <b>encryptTwoKeys</b> - has three parameters, a String named input, and two integers named key1 and key2. This method returns a String that has been encrypted using the following algorithm. Parameter key1 is used to encrypt every other character with the Caesar Cipher algorithm, starting with the first character, and key2 is used to encrypt every other character, starting with the second character.
  * For example, the call encryptTwoKeys(“First Legion”, 23, 17) should return “Czojq Ivdzle”. Note the ‘F’ is encrypted with key 23, the first ‘i’ with 17, the ‘r’ with 23, and the ‘s’ with 17, etc. Be sure to test this method.
* <b>testFileEncrypt</b> - read a file and encrypt the complete file using the Caesar Cipher algorithm, printing the encrypted message.
* <b>testEncrypt</b> - test encryption of a String from user input, printing the encrypted message.
* <b>testEncryptTwoKeys</b> - tests the encryptTwoKeys method from a String given via user input, printing the encrypted message.

Link to exercise: https://www.coursera.org/learn/java-programming-arrays-lists-data/supplement/DvNzQ/programming-exercise-implementing-the-caesar-cipher

## Breaking the Caesar Cipher

<b>WordLengths</b> - program to figure out the most common word length of words from a file. Contains the following methods:
* <b>countWordLengths</b> - has two parameters, a FileResource named resource and an integer array named counts. This method reads in the words from resource and counts the number of words of each length for all the words in resource, storing these counts in the array counts.
  * For example, after this method executes, counts[k] should contain the number of words of length k.
  * Uses <b>Character.isLetter</b> - helper method that returns true if a character is a letter, and false otherwise.
* <b>indexOfMax</b> - has one parameter named values that is an integer array. This method returns the index position of the largest element in values. 
* <b>testCountWordLengths</b> - creates a FileResource so you can select a file, and creates a counts integer array of size 31. Calls <b>countWordLengths</b> with a file and then print the number of words of each length. Calls <b>indexOfMax</b> to determine the most common word length in the file.

Link to exercise: https://www.coursera.org/learn/java-programming-arrays-lists-data/supplement/727CD/programming-exercise-breaking-the-caesar-cipher
