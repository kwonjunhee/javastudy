package prob2;

import java.util.Arrays;

public class Prob2 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		
		for(int j=0; j<=9; j++) {
			for(int i=0; i<=9; i++) {
				arr[i]++;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
