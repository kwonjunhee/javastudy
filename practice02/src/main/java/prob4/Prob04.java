package prob4;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] c1 = str.toCharArray();
		char[] c2 = new char[c1.length];
 		for(int i=0; i<c1.length; i++) {
			c2[i] = c1[c1.length-1-i];
		}
		return c2;
	}

	public static void printCharArray(char[] array){
		for(char c:array) {
			System.out.print(c);
		}
		System.out.print("\n");
	}
}