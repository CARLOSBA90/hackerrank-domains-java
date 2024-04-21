package domains;

import java.util.Scanner;

public class javaStringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
       
        stringToCompare solution = new stringToCompare(s,k);
        
        
        smallest = solution.getSmallestString();    
        largest  = solution.getLargestString();     
           
        return smallest + "\n" + largest;
    }

 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String s = scan.next();
     int k = scan.nextInt();
     scan.close();
     System.out.println(getSmallestAndLargest(s, k));
 }
 
}

class stringToCompare{
	
	private String stringParameter;
	private int delimiter;
	private int parameterLength;
	private String[] strings;
	
	
	public stringToCompare(String stringParameter, int delimiter){
		this.stringParameter = stringParameter;
		this.delimiter = delimiter;
	
		if(this.stringParameter!=null) {
			this.processParameters();
		}
	}
	
	
    private void processParameters() {
        this.parameterLength = this.stringParameter.length();
        this.strings = new String[1000];
        getArrayFromString();
    }
    
    
    public void getArrayFromString(){
        int counter = 0;
        
        while(counter<parameterLength){
            
         try{
            if(counter+this.delimiter>parameterLength){
                 strings[counter] = stringParameter.substring(parameterLength-delimiter, parameterLength);
	            }else{
	             strings[counter] = stringParameter.substring(counter, counter+delimiter);
	          }

            }catch (Exception e){ 
                e.printStackTrace();
            }
         
            counter++;
        }
        
    }
    
    
    public String[] getStrings() {
    	return strings;
    }
	
    
    public String getLargestString(){
        
        String stringResult= "";
        
        for (String stringLoop : strings) {
            
        	if(stringLoop==null) break;
        	
             if(stringLoop.compareTo(stringResult) > 0){
                  stringResult = stringLoop;
              }
        }
          
       return stringResult;
    }
    
    
    public String getSmallestString(){
        
        String stringResult= "";
        
        for (String stringLoop : strings) {
        	
        	if(stringLoop==null) break;
        	
             if(stringLoop.compareTo(stringResult) < 0  || stringResult == ""){
                  stringResult = stringLoop;
              }
        }
          
       return stringResult;
    }
	
}



/* 
##################################################################################################################
We define the following terms:

  - Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

 Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

 - string s: a string
 - int k: the length of the substrings to find


Returns
 - string: the string ' + "\n" + ' where and are the two substrings
 
Input Format

 - The first line contains a string denoting .
 - The second line contains an integer denoting .

Constraints
 - 1 < s < 1000
 - consists of English alphabetic letters only (i.e., [a-zA-Z]).
##################################################################################################################
*/