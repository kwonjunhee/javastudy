package prob2;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		System.out.println("5개의 숫자를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);

		int[] intArray = new int[ 5 ];
		double sum = 0;
		
		for(int i=0; i<intArray.length;i++) {
			intArray[i] = scanner.nextInt();
			sum+=intArray[i];
		}
		System.out.printf("평균은 %.1f입니다.", sum/5);
		
		scanner.close();
	}
}
