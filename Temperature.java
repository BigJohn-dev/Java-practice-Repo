import java.util.Scanner;
public class Temperature {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a degree in Celsius: ");
	double degree = input.nextDouble();

	double temp = (9.0 / 5.0) * degree + 32;
	System.out.printf(degree + " Celcius is " + temp + " Fahrenheit.");
}
}