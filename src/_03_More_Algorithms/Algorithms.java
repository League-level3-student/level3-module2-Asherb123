package _03_More_Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return null;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	  for (int i = 0; i < eggs.size(); i++) {
 			
         	if (eggs.get(i).contains("cracked")) {
 				//System.out.println(eggs.get(i));
 				return i;
         	//	break;
 			}
 				
 			
 		}
    	
    	return -1;
    }

	public static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean isSquare(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean isCube(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	public static int countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
	int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)==true) {
				pearls = pearls +1;
				
				//return pearls;
			}
		}
		
		
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		 double largeNum = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i)>=largeNum) {
				largeNum =peeps.get(i);
				
			}
		}
		
		
		return largeNum;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		int longString = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i)) {
				
			}
			
			
		}
		
		
		return null;
	}
}
