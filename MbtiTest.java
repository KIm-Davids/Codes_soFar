import java.util.Scanner;
	public class MbtiTest { 
		public static void main(String[] args) {



		Scanner input = new Scanner(System.in);

	
		String selectAnswer = null;


		System.out.print("What is your name? ");
		String userName = input.next();

		System.out.println("Please choose from the list of option carefully !");

		String prompt = """

		A. tough-minded, just\t\t\tB. tender-hearted, merciful
		
		""";

		

		System.out.println();


		System.out.print(prompt);
		
		selectAnswer = input.next();
		


		switch(selectAnswer) {
					case "a" -> System.out.print("You selected option A, lets continue !");
					case "b" -> System.out.print("You selected option B, lets continue !");
					default -> System.out.print("Expected A or B as Response\nI know this is an error, Please retry again\n" + prompt );
					
		}
		
		System.out.println();




		String prompt2 = """

		A. candid, straight foward, frank\tB. tactful, kind,encouraging	
	
		""";

		System.out.print(prompt2);
		selectAnswer = input.next();

		switch(selectAnswer) {
					case "a" -> System.out.print("You selected option A, lets continue !");
					case "b" -> System.out.print("You selected option B, lets continue !");
					default -> System.out.print("Expected A or B as Response\nI know this is an error, Please retry again");
			}


		System.out.println();
		
		String prompt3 = """

		A. focus on here-and-now\t\tB. look to the future, global perspectve, big picture 
	
		""";

		System.out.print(prompt3);
		selectAnswer = input.next();
		switch(selectAnswer) {
					case "a" -> System.out.print("You selected option A, lets continue !");
					case "b" -> System.out.print("You selected option B, lets continue !");
					default -> System.out.print("Expected A or B as Response\nI know this is an error, Please retry again");
				}

		
		System.out.println();
		
		String prompt4 = """

		A. expand energy, enjoy groups\t\tB. conserve energy, enjoy one-on-one
	
		""";
		
		System.out.print(prompt4);
		selectAnswer = input.next();
		switch(selectAnswer) {
					case "a" -> System.out.print("You selected option A, lets continue !");
					case "b" -> System.out.print("You selected option B, lets continue !");
					default -> System.out.print("Expected A or B as Response\nI know this is an error, Please retry again");
				


		






		}

		}
}
		