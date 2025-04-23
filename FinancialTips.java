import java.util.Scanner;
public class FinancialTips {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the subtotal: ");
	int total = input.nextInt();

	System.out.print("Enter a gratuity rate: ");
	double rate = input.nextDouble();

	double gratuity = rate / total;
	
	double subTotal = (rate / total) + 10.0;

	System.out.print("The gratuity is $" + gratuity + " and total is $" + subTotal);


}
}