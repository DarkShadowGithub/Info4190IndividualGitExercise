package calc4190;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String response = "";
		Scanner scanner = new Scanner(System.in);
		double total = 0, num1, num2, choice;
		boolean end, cont;
		do {
			System.out.println("Welcome to the calculator");
			System.out.println("Please type your first number: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Invalid input. Please try again ");
				num1 = scanner.nextDouble();
			}
			num1 = scanner.nextDouble();
			System.out.println("Please type your second number: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Invalid input. Please try again ");
				choice = scanner.nextDouble();
			}
			num2 = scanner.nextDouble();
			do {
				cont = false;
				System.out.println("Would you like to add, subtract, multiply, or divide. Select 1 for add,\n 2 for subtraction, 3 for multiplication, 4 for division: ");
				while (!scanner.hasNextInt()) {
					System.out.println("Invalid input. Please try again ");
					choice = scanner.nextInt();
				}
				choice = scanner.nextInt();
				if (choice == 1) {
					total = Addition(num1, num2);
					System.out.println("Your total for this calculation is: " +  total + "\n");
				}
				else if(choice == 2) {
					total = Subtraction(num1, num2);
					System.out.println("Your total for this calculation is: " + total + "\n");
				}
				else if (choice == 3) {
					total = Multiplication(num1, num2);
					System.out.println("Your total for this calculation is: " + total + "\n");
				}
				else if (choice == 4) {
					total = Division(num1, num2);
					System.out.println("Your total for this calculation is: " + total + "\n");
				}
				else { 
					System.out.println("not a valid choice \n");
					cont = true;
				}
			} while (cont == true);
			System.out.println("Would you like to continue? type y for yes or anything else for no: " + "\n");
			response = scanner.next();
			if (response.equals("y")) {
				end = false;
			}
			else  {
				System.out.println("Thank you for using the caluclator");
				end = true;
			}
		} while (end == false);
		//This is the end of the loop.

	}
	public static double Addition(double num1, double num2) {
		double total = 0;
		Addition add = new Addition();
		total = add.getTotal(num1,  num2);
		return total;
	}
	private static double Subtraction(double num1, double num2) {
		double total = 0;
		Subtraction sub = new Subtraction();
		total = sub.getTotal(num1,  num2);
		return total;
	}
	private static double Multiplication(double num1, double num2) {
		double total = 0;
		Multiplication multi = new Multiplication();
		total = multi.getTotal(num1,  num2);
		return total;
	}
	private static double Division(double num1, double num2) {
		double total = 0;
		Division divi = new Division();
		total = divi.getTotal(num1, num2);
		return total;
	}



}
