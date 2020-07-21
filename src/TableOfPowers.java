import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int userInput;
		String playAgain;
		
		System.out.println("Learn your squares and cubes!");
		System.out.println();
	
	do {	
		System.out.println("Enter an Integer");
		
		userInput = scnr.nextInt();
		
		System.out.printf("%-11s%-13s%-13s\n","Number","Squared","Cubed");
		System.out.printf("%-11s%-13s%-13s\n","======","=======","======");
		
		for (int i = 1; i <= userInput; i++) {
			System.out.printf("%-11s%-13s%-13s\n", i, (i *i), (i * i * i));
		}
		
		System.out.println();
		System.out.println("Would you like to continue (y/n)?");
		playAgain = scnr.next();
		
		}while (playAgain.equalsIgnoreCase("y"));

	System.out.println("Thank you for playing");
	scnr.close();
	

	}

}
