package helloWorld;

public class Test1 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i : a) {
		  System.out.println(i);
		}	
		  System.out.println("**************************");
		  System.out.println( a[0] +" "+ a[1]+" "+a[3]);
		  System.out.println(a.length);
		  System.out.println("**************************");
		  
		  //using for loop
		  
		  for(int i=0;i<cars.length;i++) {
			  System.out.println(cars[i]);
		  }
		  System.out.println("************using for each loop**************");
		  
		  //using for each loop
		  
		  for(String i : cars) {
			  System.out.println(i);
		  }
		  for(int i : a) {
			  System.out.println(i);
		  }
	}
}
