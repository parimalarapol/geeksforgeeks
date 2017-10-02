package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {
	public static void main(String[] args) {
		int[] a = {200, 13, 96, 75, 34, 96, 92, 34, 76, 80, 3, 2, 7, 45, 81, 342, 420, 111};
		int[] b = {9, 5, 6, 9, 0, 1, 2, 1, 6, 10};
		int v = 111;
		SumOfTwo s = new SumOfTwo();
		System.out.println(s.sumOfTwo(a, b, v));
	}
	
	boolean sumOfTwo(int[] a, int[] b, int v) {
		if((a.length == 0) || (b.length == 0))
	        return false;
	    Map<Integer, Integer> myMap = new HashMap<>();
	    for(int i : a) {
	        if(!myMap.containsKey(i) && i <= v)
	            myMap.put(i, v-i);
	    }
	    for(int j : b) {
	        if(myMap.containsValue(j))
	            return true;
	    }
		return false;
	}
}
