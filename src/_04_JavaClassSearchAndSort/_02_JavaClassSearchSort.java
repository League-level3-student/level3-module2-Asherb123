package _04_JavaClassSearchAndSort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {
    
    public static int[] arraySort(int[] arr) {
       
    	Arrays.sort(arr);
        
        return arr;
    }
    
    public static List<Double> listSort(List<Double> list){
        Collections.sort(list);
        return list;
    }

    public static char[] arraySearch(char[] arr, char key) {
        Arrays.sort(arr);
        return arr;
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
       Collections.binarySearch(list, key);
        return listSearch(list, list);
    }

	private static Boolean listSearch(List<Character> list, List<Character> list2) {
		// TODO Auto-generated method stub
		return null;
	}
}
