import java.util.Scanner;

class MathWizard {

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MathWizard mw = new MathWizard();

        System.out.println("1. Prime Check");
        System.out.println("2. Factorial");
        System.out.println("3. GCD");
        System.out.println("4. LCM");
        System.out.println("5. Power");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter a number: ");
                int n = sc.nextInt();
                System.out.println("Prime: " + mw.isPrime(n));
                break;

            case 2:
                System.out.print("Enter a number: ");
                n = sc.nextInt();
                System.out.println("Factorial: " + mw.factorial(n));
                break;

            case 3:
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("GCD: " + mw.gcd(a, b));
                break;

            case 4:
                System.out.print("Enter two numbers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("LCM: " + mw.lcm(a, b));
                break;

            case 5:
                System.out.print("Enter base and exponenet: ");
                int base = sc.nextInt();
                int exp = sc.nextInt();
                System.out.println("Power: " + mw.power(base, exp));
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}