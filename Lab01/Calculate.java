import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String strNum1 = scan.nextLine();
        double num1 = Double.parseDouble(strNum1);

        System.out.print("Enter the second number: ");
        String strNum2 = scan.nextLine();
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
		double quotient = 0;
		
        if (num2 != 0) {
            quotient = num1 / num2;
			System.out.println("Sum: " + sum);
			System.out.println("Difference: " + difference);
			System.out.println("Product: " + product);
			System.out.println("Quotient: " + quotient);
        } else {
			System.out.println("Sum: " + sum);
			System.out.println("Difference: " + difference);
			System.out.println("Product: " + product);
            System.out.println("Quotient error!");
        }
    }
}