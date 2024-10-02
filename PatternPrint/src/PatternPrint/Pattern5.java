package PatternPrint;

public class Pattern5 {
	public static void main(String[] args) {
		int n=5;
		int i,j;
		for(i=n;i>=1;i--) {
			for(j=n;j>i;j--) {
				System.out.print(" ");
		}
			for( int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}	
	}
}
