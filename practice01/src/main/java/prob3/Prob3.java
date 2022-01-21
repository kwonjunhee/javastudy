package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int ans=0;
		
		while(num/2>0) {
			ans += num;e=j
			num-=2;
			System.out.println(num);
			
		}
		
//		for(int i=0; i<num/2; i++) {
//			ans += num;
//			
//			num-=2;
//			System.out.println(num);
//		}
		

		
		System.out.println("결과 값:"+ans);
		scanner.close();
	}
}
