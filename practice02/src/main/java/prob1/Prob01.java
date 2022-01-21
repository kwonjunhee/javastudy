package prob1;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		int money = scanner.nextInt();
		
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		for(int i:MONEYS) {
			int cnt=money/i;
			money-=(cnt*i);
			System.out.println(i+"원:" +cnt+"개");
		}
		scanner.close();
 	}
}