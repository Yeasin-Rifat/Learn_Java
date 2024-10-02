package helloWorld;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = obj.nextInt();
		if(num==0){
			System.out.println("Its zero");
			
		}
		else if(num%2==0) {
			System.out.println("even");
		}
	
		else {
			System.out.println("odd");
		}
		
		for(int i = 1; i<=num; i++) {
			
			sum = sum+i;
			
			
		}
		System.out.println("Sum 0f 0-given number is: " +sum);
		
		
		
	}


}
