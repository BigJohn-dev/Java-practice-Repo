import java.util.Scanner;

public class Hexagon {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the side of a hexagon: ");
	double side = input.nextDouble();

	double root = Math.pow(3, 0.5);

	double area = ((3 * root) / 2) * (side * side);

	System.out.printf("The area of the Hexagon is " + "%.4f", area);
}


}