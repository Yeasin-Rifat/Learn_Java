package helloWorld;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Write something: ");
		String name = myObj.nextLine();
		System.out.println(name);
	}

}
