import java.util.Scanner;
public class Kilograms {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number in pounds: ");
	double pound = input.nextDouble();

	double kilos = pound * 0.454;

	System.out.print(pound + " pounds is " + kilos + " kilograms");
}

}