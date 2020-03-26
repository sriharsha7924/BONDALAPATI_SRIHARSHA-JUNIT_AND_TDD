package com.epam.junit;
import com.epam.*;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class RemovingCharactersTest {
		   private String inputString;
		   private RemovingCharacters rc;
		   private String expectedResult;
		   @Before
		   public void initialize() {
		     rc =new RemovingCharacters();
		    
		   }

			
		   public RemovingCharactersTest(String inputString, String expectedResult) {
		      this.inputString= inputString;
		      this.expectedResult = expectedResult;
		   }
		   @Parameterized.Parameters
		   public static Collection inputs() {
		      return Arrays.asList(new Object[][] {
		         {"ABCD","BCD"},
		         {"AACD","CD"  },
		         {"BACD","BCD"},
		         {"BBAA","BBAA"  },
		         {"AABAA","BAA"},
		         });
		   }

		   
		   @Test
		   public void testInterest() {
		      assertEquals(expectedResult, rc.removingPrefixA(inputString));
		   }
		  
	}
