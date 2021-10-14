package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */
	
	
    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	 String[] whereWaldo = new String [5];
    	 whereWaldo [0] = "Joe mamma";
    	 whereWaldo [1] = "Juan";
    	 whereWaldo [2] = "Waldo";
    	 whereWaldo [3]= "Cody";
    	 whereWaldo [4] = "Jeff";
    			 
    	
    	
    	assertEquals(2, _01_LinearSearch.linearSearch(whereWaldo, "Waldo"));
  
    
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
      
     int[] where50 = new int[6];
     where50[0]= 1;
     where50 [1]= 50;
     where50[2]= 100;
     where50[3]= 150;
     where50[4]= 200;
     where50 [5] = 1000000;
    		 
    	assertEquals(1, _02_BinarySearch.binarySearch(where50, 0, 5, 50));
    }
}
