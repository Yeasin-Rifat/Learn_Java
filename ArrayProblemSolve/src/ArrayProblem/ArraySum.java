package ArrayProblem;

public class ArraySum {
	public static void main(String[] args) {
		int[] arr = {3,4,5,7,9} ;
		int sum = 0;
		/*
		 * for(int i=0; i<arr.length;i++) { sum = sum+arr[i]; }
		 */
		for(int i:arr) {
			sum = sum+i;
		}
		
		
		System.out.println(sum);
	}
}
