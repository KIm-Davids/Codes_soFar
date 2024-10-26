import java.util.ArrayList;
import java.util.Scanner;
	public class ArrayPracticeJennyPlus {
		public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		ArrayList<Integer> listedNames = new ArrayList<Integer>();				
		int counter = 0;
		
		
		int age = 0;

		
		for(counter = 0; counter <= 5; counter++) {

		System.out.println("Enter age: ");
		age = input.nextInt();


		listedNames.add(age);
		
		
		}


		for(counter = 0; counter < listedNames.size(); counter++){

		System.out.println("The ages are: " + listedNames.get(counter));
		
		}
		
		}
}