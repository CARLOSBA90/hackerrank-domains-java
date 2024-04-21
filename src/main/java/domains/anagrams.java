package domains;

import java.util.Scanner;

public class anagrams {
	
    static boolean isAnagram(String a, String b) {
    	
    	if(a.length()!=b.length()) 
    		return false;
    	
    	String alphabet = "abcdefghijklmnopqrstuvwxyz";
    	int aCounter;
		int bCounter;
    	
    	for(int i=0;i<alphabet.length();i++){
    		aCounter = 0;
    		bCounter = 0;
    		
    		char character = alphabet.charAt(i);
    		
    		for(int aLoop=0;aLoop<a.length();aLoop++) {
    			if(character==Character.toLowerCase(a.charAt(aLoop)))
    			   aCounter++;
    		}
    			
    		for(int bLoop=0;bLoop<b.length();bLoop++) {
    			if(character==Character.toLowerCase(b.charAt(bLoop)))
    			   bCounter++;
    		}
    		
    		if (aCounter!=bCounter)
    			return false;
        }
    	
    	
    	return true;
    }
    

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}

/* 
##################################################################################################################
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string


Returns
 - boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.


Input Format

 - The first line contains a string .
 - The second line contains a string .

Constraints
 - 1 < a , b < 50
 - Strings  and  consist of English alphabetic characters.
 - The comparison should NOT be case sensitive.

##################################################################################################################
*/