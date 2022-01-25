package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goods[] goods = new Goods[COUNT_GOODS];

		System.out.println("구매할 상품명, 가격, 갯수를 입력하세요.");
		
		for(int i = 0; i < COUNT_GOODS; i++) {
			String name = scanner.next();
			int price = scanner.nextInt();
			int count = scanner.nextInt();
			Goods good = new Goods(name, price, count);
			goods[i] = good;
		}
		
		for(int i = 0; i < COUNT_GOODS; i++) {
			System.out.printf("%s(가격:%d원)이 %d개 입고 되었습니다.\n", goods[i].getName(), goods[i].getPrice(), goods[i].getCount());
		}
		scanner.close();
	}
}
