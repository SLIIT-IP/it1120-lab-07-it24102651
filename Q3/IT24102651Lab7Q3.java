import java.util.Scanner;

public class IT24102651Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double DISCOUNT_RATE = 0.05;
        double totalBill;
        double discount;
        double amountToPay;

        for (int i = 1; i <= 5; i++) {
			System.out.println("Customer" + i + "");
            System.out.print("Enter total bill amount: ");
            totalBill = scanner.nextDouble();

            System.out.print("Enter mode of payment : ");
            char paymentMode = scanner.next().charAt(0);

            
            if (paymentMode == 'C' || paymentMode == 'c') {
                discount = totalBill * DISCOUNT_RATE;
                amountToPay = totalBill - discount;
                System.out.printf("Discount: %.2f%n", discount);
                System.out.printf("Amount to be paid : %.2f%n", amountToPay);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                amountToPay = totalBill;
                System.out.printf("No discount applicable\n Amount to be paid: %.2f%n", amountToPay);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
        }

        scanner.close();
    }
}