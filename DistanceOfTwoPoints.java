<<<<<<< HEAD
import java.util.Scanner;

public class DistanceOfTwoPoints {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter x1 and y1: ");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();

	System.out.print("Enter x2 and y2: ");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();

	double point1 = (x2 - x1) * (x2 - x1);
	double point2 = (y2 - y1) * (y2 - y1);

	double sum = point1 + point2;

	double root = Math.pow(sum, 0.5);

	System.out.println("The distance between the two points is " + root);

}




=======
import java.util.Scanner;

public class DistanceOfTwoPoints {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter x1 and y1: ");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();

	System.out.print("Enter x2 and y2: ");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();

	double point1 = (x2 - x1) * (x2 - x1);
	double point2 = (y2 - y1) * (y2 - y1);

	double sum = point1 + point2;

	double root = Math.pow(sum, 0.5);

	System.out.println("The distance between the two points is " + root);

}




>>>>>>> 5a6effd40bd227defd7803674a361379141d3349
}