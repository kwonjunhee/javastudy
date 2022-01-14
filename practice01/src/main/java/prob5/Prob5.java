package prob5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob5 {

	public static void main(String[] args) {
		int cnt=0;
		boolean flag = false;
		for(int i=1; i<=99; i++) {
			String[] arr = Integer.toString(i).split("");
			List<String> list = new ArrayList<String>(Arrays.asList(arr));
			if(list.contains("3")||list.contains("6")||list.contains("9")) {
				list.add("짝");
			}
			if(list.contains("짝")) {
				for(String li:list) {
					System.out.print(li);
				}
				System.out.print("\n");
			}
			
		}
		
	}
}
