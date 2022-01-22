package prob5;


public class Prob5 {

	public static void main(String[] args) {
		for(int i=1; i<=99; i++) {
			int cnt=0;
			String[] arr = Integer.toString(i).split("");
			for(int j=0; j<arr.length;j++) {
				if(arr[j].equals("3")||arr[j].equals("6")||arr[j].equals("9")) {
					cnt++;
				}
			}
			System.out.print("\n"+i);
			for(int j=0;j<cnt;j++) {
				System.out.print(" 짝");
			}
		}		
	}
}
