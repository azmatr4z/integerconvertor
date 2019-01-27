package integerConvertor;

import java.io.IOException;

public class Solution {

	// Because Roman Numeral notation has no exceptions we can just take the number and 
	// remove the highest denominations until we need to use a lower denomination.
	// Also because those that are 10 less, 100 less, 1 less require slightly different notation
	// this can just be added because there are no exceptions.
	static String integerConvertor(int input) {

		// We need a variable to store the Roman Numeral string
		String result = "";
		
		// Started with 1000 as the largest denomination 
	    while(input >= 1000) {
	    	input -= 1000;
	    	result +="M";
	    }
	    // 900 is classed as -100 + 1000
	    while(input >= 900) {
    		input -= 900;
    		result +="CM";
    	}
	    while(input >= 500) {
	    	input -= 500;
	    	result +="D";
	    }
	    // 400 is classed as -100 + 500
	    while(input >= 400) {
	    	input -= 400;
	    	result +="CD";
	    }
	    while(input >= 100) {
	    	input -= 100;
	    	result +="C";
	    }
	    // 90 is classed as -10 + 100
	    while(input >= 90) {
	    	input -= 90;
	    	result +="XC";
	    }
	    while(input >= 50) {
	    	input -= 50;
	    	result +="L";
	    }
	    // 40 is classed as -10 + 50
	    while(input >= 40) {
	    	input -= 40;
	    	result +="XL";
	    }
	    while(input >= 10) {
	    	input -= 10;
	    	result +="X";
	    }
	    // 9 is classed as -1 + 10
	    while(input >= 9) {
	    	input -= 9;
	    	result +="IX";
	    }
	    while(input >= 5) {
	    	input -= 5;
	    	result +="V";
	    }
	    // 4 is classed as -1 + 5
	    while(input >= 4) {
	    	input -= 4;
	    	result +="IV";
	    }
	    while(input >= 1) {
	    	input -= 1;
	    	result +="I";
	    }    	
    	return result;
    }


	    public static void main(String[] args) throws IOException {

	        // Input integer to convert
	    	int input = 999;
	    	
	    	
	    	// Call function to convert number
	        String result = integerConvertor(input);

	        // Print number
	        System.out.println("The number " + String.valueOf(input) + " as a Roman Numeral is: " + result);
	    }
	
}
