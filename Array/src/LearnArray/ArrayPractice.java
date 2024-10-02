package LearnArray;

public class ArrayPractice {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6}; 
		System.out.print(a[0]);
		System.out.println(a[1]);
		System.out.println();
		
		  for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 
		for(int i:a) {
			System.out.println(i);
		}
	}
}
