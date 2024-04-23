package domains;

import java.util.Scanner;
import java.util.*;

public class stringToken {

	
	public static void printTokenString(String string) {
		StringBuilder tokenString = new StringBuilder();
        ArrayList<String> tokensArray= new ArrayList<>();
        Set<Character> options = new HashSet<>();
        options.add(' ');
        options.add('!');
        options.add(',');
        options.add('?');
        options.add('.');
        options.add('_');
        options.add('\'');
        options.add('@');
        
   
		for(int i=0;i<string.length();i++) {
			char character = string.charAt(i);
			
			if (options.contains(character)) {
				
				if(tokenString.length() > 0){
			     tokensArray.add(tokenString.toString());
				 tokenString.setLength(0);
				}
			
			 }else{
				 tokenString.append(character);
			}
		}		
		
		
	     if (tokenString.length() > 0) {
	            tokensArray.add(tokenString.toString());
	     }
	     
		   
		System.out.println(tokensArray.size());
		
	    for (String stringLoop : tokensArray) {
	            System.out.println(stringLoop);
	     }
	}
	
	
	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	       String s = scan.nextLine();
	       printTokenString(s);
	       scan.close();
	}

}



/* 
##################################################################################################################
Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Format

A single string, .

Constraints

 is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
Output Format

On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .

Sample Input

He is a very very good boy, isn't he?
Sample Output

10
He
is
a
very
very
good
boy
isn
t
he
Explanation

We consider a token to be a contiguous segment of alphabetic characters. There are a total of  such tokens in string , and each token is printed in the same order in which it appears in string .
##################################################################################################################
*/