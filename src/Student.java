public class Student {
    static void student(String name, int id, char section,int phone){
        System.out.println("*****Student Information***** " );
        System.out.println("Name: " + name );
        System.out.println("Id :" + id );
        System.out.println("Section: " + section );
        System.out.println("Phone: " + phone );

    }
    public static void main(String[] args) {
        student("Rifat", 1, 'A', 123);
        student("Rohim", 2, 'B', 1234);
        student("Abdullah", 3, 'C', 12345);

    }
}
