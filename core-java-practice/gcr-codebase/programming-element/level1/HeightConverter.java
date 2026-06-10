import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double inches = height / 2.54;
        double feet = inches / 12;

        System.out.println("Your Height in cm is " + height
                + " while in feet is " + feet
                + " and inches is " + inches);
    }
}