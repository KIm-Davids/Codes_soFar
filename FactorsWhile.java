import java.util.Scanner;
	public class FactorsWhile {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int factor = 0;	
	int counter = 1;

	System.out.print("Enter a number: ");
	int num1 = input.nextInt();


	while(counter<=num1) {

	if(num1 % counter == 0) {

	factor = factor + 1;
	}
	counter++;	}
	System.out.println(" " + factor);

	}
	
     }
}