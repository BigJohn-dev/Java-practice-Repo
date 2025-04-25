<<<<<<< HEAD
import java.util.Scanner;

public class RunwayLength {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Speed: ");
	double speed = input.nextDouble();

	System.out.print("Enter acceleration: ");
	double acceleration = input.nextDouble();

	double length = (speed * speed) / (2 * acceleration);

	System.out.printf("The minimum runway length for this airplane is " + "%.3f", length);


}

=======
import java.util.Scanner;

public class RunwayLength {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Speed: ");
	double speed = input.nextDouble();

	System.out.print("Enter acceleration: ");
	double acceleration = input.nextDouble();

	double length = (speed * speed) / (2 * acceleration);

	System.out.printf("The minimum runway length for this airplane is " + "%.3f", length);


}

>>>>>>> 5a6effd40bd227defd7803674a361379141d3349
}