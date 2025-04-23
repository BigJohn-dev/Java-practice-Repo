import java.util.Scanner;
public class VolumeOfACylinder {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the radius and length of a cylinder: ");
	double radius = input.nextDouble();
	double length = input.nextDouble();

	double pi = 3.14159;

	double area = radius * radius * pi;
	double volume = area * length;

	System.out.printf("The area is " + "%.4f\n", area);
	System.out.printf("The volume is " + "%.1f\n", volume);
}
}