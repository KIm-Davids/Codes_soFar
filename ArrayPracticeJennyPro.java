import java.util.ArrayList;
import java.util.Scanner;
	public class ArrayPracticeJennyPro {
		public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		ArrayList<String> listedNames = new ArrayList<String>();			ArrayList<Integer> listedAge = new ArrayList<Integer>();				
	
		int counter = 0;
		
		String name = null;
		int age = 0;

		
		for(counter = 0; counter <= 5; counter++) {

		System.out.println("Enter name: ");
		name = input.next();



		System.out.println("Enter age: ");
		age = input.nextInt();


		listedNames.add(name);
		listedAge.add(age);
		
		
		}


		for(counter = 0; counter < listedNames.size(); counter++){

		System.out.println("The names are: " + listedNames.get(counter));
		System.out.println("The ages are: " + listedAge.get(counter));
		}
		
		}
}