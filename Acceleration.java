import java.util.Scanner;

public class Acceleration {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter starting velocity: ");
	double Velocity0 = input.nextDouble();

	System.out.print("Enter ending velocity: ");
	double Velocity1 = input.nextDouble();

	System.out.print("Enter time: ");
	double time = input.nextDouble();

	double acceleration = (Velocity1 - Velocity0) / time;

	System.out.printf("The average acceleration is " + "%.4f", acceleration);
}

}