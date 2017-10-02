package glassdoor;

public class RearrangeZeroOne {

	public static void main(String[] args) {
		int[] a = {0,0,0,1,1,0,1,1,1,1,0,0,1,1,0,0,0,1,0,1,0,0,0};
		int l = a.length;
		for(int i = 0, j = 1; j < l ;) {
			if(a[i] == 0)
					i++;
			else if(i != j) {
				if(a[i] == 1 && a[j] == 0) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i++;
				}
			}
			j++;
		}
		for(int k : a)
			System.out.print(k);
	}
}
