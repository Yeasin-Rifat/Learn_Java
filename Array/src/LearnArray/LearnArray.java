package LearnArray;

public class LearnArray {
	public static void main(String[] args) {
		// declare array;
		String[] name = {"BMW","VOLVO","FARARI","RIFAT","YEASIN"};
		int[] age = {10,20,30,50};
		
		 //memory allocate;
		 // name = new String[10]; age = new int[5];
		
		   System.out.println("Accessing Elements of Array using Index:");
		   System.out.println("First Element: " + age[0]);
		   System.out.println("SecondElement: " + age[1]);
		   System.out.println("Third Element: " + age[2]);
		   System.out.println("FourthElement: " + age[3]);  
		   System.out.println();
		   System.out.println(name[0]);
		   System.out.println(name[1]);
		   System.out.println(name[2]);
		   System.out.println(name[3]);
		   System.out.println();
		   System.out.println("Accessing Elements of Array using FOR LOOPs:");
		   //print array using for loop
		   for(int i=0; i<name.length;i++ ) {
			   System.out.println(name[i]);
			  
		   }
		   
		   System.out.println("Accessing Elements of Array using FOREACH LOOPs:");
		   
		   
		for(int i:age) {
			System.out.println(i);
		}
		for(String i:name) {
			System.out.println(i);
		}

		
	}

}
