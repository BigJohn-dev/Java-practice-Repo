import java.util.Scanner;

public class NumberOfYears {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of minutes: ");
	int mins = input.nextInt();

	int year = mins / 1440;
	int days = year / 365;
	int days1 = year % 365;

	System.out.println(mins + " minutes is approximately " + days + " years and " + days1 + " days");


}

}