import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static void processPayment(double billAmount, double payment)
            throws InsufficientFundsException {

        if (payment < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds. Need ₹" + (billAmount - payment) + " more.");
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter total bill amount: ");
            double totalBill = Double.parseDouble(sc.nextLine());

            System.out.print("Enter number of items: ");
            int items = Integer.parseInt(sc.nextLine());

            double averageCost = totalBill / items;
            System.out.println("Average cost per item: " + averageCost);

            String[] patients = {"Rahul", "Priya", "Amit"};

            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient Name: " + patients[index]);

            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());

            processPayment(totalBill, payment);

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter numeric values only.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Hospital billing process completed.");
            sc.close();
        }
    }
}