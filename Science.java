import java.util.Scanner;

public class Science {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter amount of water: ");
	double water = input.nextDouble();

	System.out.print("Enter the initial temperature: ");
	double temp1 = input.nextDouble();

	System.out.print("Enter final temperature: ");
	double temp2 = input.nextDouble();

	double energy = water * (temp2 - temp1) * 4184;

	System.out.println("The energy needed is " + energy);
}



}