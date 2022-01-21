package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		while( true ) {
			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt( 100 ) + 1;
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			boolean flag = false;
			while(!flag) {
				int num = scanner.nextInt();
				if(num>correctNumber) {
					System.out.println("더 낮게");
				} else if (num < correctNumber) {
					System.out.println("더 높게");
				} else {
					System.out.println("맞았습니다");
					flag=true;
				}
			}
			//새 게임 여부 확인하기
			System.out.print( "다시 하겠습니까(y/n)>>" );
			String answer = scanner.next();
			if( "y".equals( answer ) == false ) {
				break;
			}
		}
		scanner.close();
	}
}