package com.epam;

public class RemovingCharacters {
   public String removingPrefixA(String inputString) {
	   if(inputString.substring(0,2).equals("AA")) {
		   return inputString.substring(2);
	   }
	    if(!(inputString.substring(0,1).equals("A"))&&inputString.substring(1,2).equals("A")) {
		   return inputString.substring(0,1)+inputString.substring(2);
	   }
	   if((inputString.substring(0,1).equals("A"))&&!(inputString.substring(1,2).equals("A"))) {
		   return inputString.substring(1);
	   }
	   return inputString;
   }
}
