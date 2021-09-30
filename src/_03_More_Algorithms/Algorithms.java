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
		String s= "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length()>longString) {
			longString=words.get(i).length();
			
			s = words.get(i);
			
			}
			
			
		}
		
		return s;
		//return null;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
	boolean sos = false;
		for (int j = 0; j < message1.size(); j++) {
			
		
		if (message1.get(j).contains("... --- ...") ) {
			sos = true;
			break;
		}
		else {
			sos = false;
		}
	}
		return sos;	
		
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < results.size()-1; i++) {
			if (results.get(i)>results.get(i+1)) {
				//highScore = results.get(i);
				
				
				Double temp = results.get(i);
				
				results.set(i, results.get(i+1));
				
			results.set(i+1, temp);
				
			}
		
		}
	
		
		return results;
		//return null;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		for (int i = 0; i < unsortedSequences.size()-1; i++) {
			if (unsortedSequences.get(i).length()>unsortedSequences.get(i+1).length()) {
				
				String temp  = unsortedSequences.get(i);
				
				unsortedSequences.set(i, unsortedSequences.get(i+1));
				
				unsortedSequences.set(i+1, temp);
				
			}
			
		}
		
		
		return unsortedSequences;
		//return 0;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		for (int i = 0; i < words.size()-1; i++) {
		int worrds= 	words.get(i).compareTo(words.get(i+1));
			System.out.println(worrds);
			if (worrds<0) {
				String temp = words.get(i);
				
				words.set(i, words.get(i+1));
				
				words.set(i+1, temp);
			}
		}
		
		
		
		return words;
	}
}
