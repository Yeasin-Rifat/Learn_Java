import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        if(n%2!=0 && n<100){
            System.out.println("Weird");
        }
        else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            }
            if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }

        }

    }
}
