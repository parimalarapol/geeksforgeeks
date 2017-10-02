package interviewPractice;

public class StrStrKmpAlgo {

	public static void main(String[] args) {
		StrStrKmpAlgo str = new StrStrKmpAlgo();
		String s = "CodefightsIsAwesome";
		String x = "IsA";
		int[] temp = new int[x.length()];
		char[] x1 = x.toCharArray();
		char[] s1 = s.toCharArray();
		temp = str.getTempArray(x, temp, x1);
		System.out.println(str.strStr(s1, x1, temp));
	}
	
	int[] getTempArray(String x, int[] temp, char[] x1) {
		temp[0] = 0; 
		for(int i = 0, j = 1 ; j < x.length() ; ) {
			if(x1[i] == x1[j]) {
				temp[j] = i+1;
				i++;
				j++;
			}
			else { 
				if(i == 0) {
					temp[j] = 0;
					j++;
				}
				else {
					while(!(i==0) && (x1[i] != x1[j]))
						i = temp[i-1];
					if((x1[i] == x1[j] && i == 0) || (i != 0 && x1[i] == x1[j]))
						temp[j] = i+1;
					else if(i == 0 && x1[i] != x1[j])
						temp[j] = 0;
						
				}
			}
		}
		return temp;
	}
	
	int strStr(char[] s, char[] x, int[] temp) {
		int count = 0, index = 0;
		for(int i = 0 , j = 0 ; (i < s.length) && (j < x.length) ;) {
			if(s[i] == x[j]) {
				count++;
				i++; 
				j++;
				System.out.println("in if, i - "+i+", j - "+j);
			}
			else {
				System.out.println("in else, i - "+i+", j - "+j);
				if(j == 0) 
					i++;
				else {
					j = temp[j-1];
					count = j;
					index = i - count;
				}
			}
			if(count == x.length) {
				index = i - count;
				return index;
			}
		}
		return -1;
	}

}
