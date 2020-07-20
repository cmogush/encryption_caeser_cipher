//WordPlay
//2017 Christopher Mogush

import edu.duke.*;
import java.io.*;
import java.util.Scanner;

public class WordPlay {
    public void testIsVowel(){
        System.out.println(isVowel('e'));
    }
    
    public boolean isVowel(char ch){
        char upCh = Character.toUpperCase(ch);
        //return  true if ch is a vowel
        if(upCh == 'A' || upCh == 'E' || upCh == 'I' || upCh == 'O' || upCh == 'U'){
        return true;
        }
        //else return false
    return false;
    }
    
    public void testReplaceVowels(){
        System.out.println(replaceVowels("Hello World",'*'));
    }
    
    public String replaceVowels(String phrase, char ch){
        StringBuilder newPhrase = new StringBuilder(phrase);
        for (int i = 0; i < phrase.length(); i++){
            char currChar = phrase.charAt(i); //set current character to currChar 
            //setup currChar to be encrypted
            currChar = Character.toUpperCase(currChar); //sets currChar to upper case
            if(isVowel(currChar)){ //test to see if ch is a vowel
                newPhrase.setCharAt(i, ch); //replace vowel with ch
            }
            
        }
        //return string with all vowels repalced by ch
        String output = newPhrase.toString();
        return output;
    }
    
    public void testEmphasize(){
        System.out.println(emphasize("dna ctgaaactga", 'a'));
        System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
    }
    
    public String emphasize(String phrase, char ch){
        String upPhrase = phrase.toUpperCase();
        ch = Character.toUpperCase(ch); //set ch to uppercase
        StringBuilder newPhrase = new StringBuilder(phrase);
        for (int i = 0; i < phrase.length(); i++){
            char currChar = upPhrase.charAt(i); //set current character to currChar of upPhrase
            //setup currChar to be encrypted
            currChar = Character.toUpperCase(currChar); //sets currChar to upper case
            if((i+1) % 2 == 0 && currChar == ch){ //test to see if number is even
                newPhrase.setCharAt(i, '*'); //if even, replace with *
            }
            if((i+1) % 2 == 1 && currChar == ch){ //test to see if number is odd
                newPhrase.setCharAt(i, '+'); //if even, replace with +
            }
        }
        //return a String that is the string phrase but with the Char ch (upper- or lowercase) replaced by
        //‘*’ if it is in an odd number location in the string
        //‘+’ if it is in an even number location in the string
        String output = newPhrase.toString();
        return output;
    }
}
