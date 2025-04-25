<<<<<<< HEAD
import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("NOTE: temperature should be between -58F and 41F");
	System.out.print("Wind speed should be greater than or equal to 2");

	System.out.print("\nEnter the temperature in Fahrenheit: ");
	double temp = input.nextDouble();

	System.out.print("Enter the wind speed in mp/h: ");
	double wind = input.nextDouble();

	if (temp < -58 || temp > 41) {
	System.out.print("Incorrect input..");

}	else if (wind < 2) {
	System.out.print("Incorrect input..");

}	else {
	

}



}

=======
import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("NOTE: temperature should be between -58F and 41F");
	System.out.print("Wind speed should be greater than or equal to 2");

	System.out.print("\nEnter the temperature in Fahrenheit: ");
	double temp = input.nextDouble();

	System.out.print("Enter the wind speed in mp/h: ");
	double wind = input.nextDouble();

	if (temp < -58 || temp > 41) {
	System.out.print("Incorrect input..");

}	else if (wind < 2) {
	System.out.print("Incorrect input..");

}	else {
	

}



}

>>>>>>> 5a6effd40bd227defd7803674a361379141d3349
}