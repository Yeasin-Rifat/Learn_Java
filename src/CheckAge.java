public class CheckAge {
   static void checkAge(int age) {
       if(age<18){
           System.out.println("Access Denied");
       }
       if(age>=18){
           System.out.println("Access Granted");
       }

   }
   public static void main(String[] args) {
       checkAge(0);
       checkAge(15);
       checkAge(20);
   }
}
