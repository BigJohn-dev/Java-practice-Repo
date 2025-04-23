import java.util.Scanner;
public class SumDigit {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number between 0 and 1000: ");
	int number = input.nextInt();

	if (number < 0 && number > 1000) {
	System.out.println("Invalid input. Try again!!");

}	else {
	int num1 = number / 1000;
	int numA = (number / 1000) % 1000;

	int num2 = number / 100;
	int numB = (number / 100) % 100;

	int num3 = number / 10;
	int numC = (number / 10) % 10;

	int total = numA + numB + numC; 
	System.out.print("The sum of the digits is " + ""total);
}

}
}