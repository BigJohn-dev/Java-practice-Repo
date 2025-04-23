import java.util.Scanner;
public class FeetToMeters {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a value for feet: ");
	double value = input.nextDouble();

	double feet = value * 0.305;

	System.out.println(value + " feet is " + feet + " meters");
}
}