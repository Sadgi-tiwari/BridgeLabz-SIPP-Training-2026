public class CoffeeShop {
    String CoffeeTypes;
    int Quantity;
    public void calculatePrice(String Type, double price){
       double bill = price*Quantity;
       double gst = price*0.18;
       double FinalBill = bill+gst;
       return FinalBill;
    }
    public void generateBill(double bill){
        System.out.println("-------------------------------------------------------");
        System.out.println("COFFEE TYPE ->"+ CoffeeTypes);
        System.out.println("QUANTITY ->"+ Quantity);
        System.out.println("BILL AMOUNT ->"+ bill);
        System.out.println());
        System.out.println("-------------------------------------------------------");
    }
    public static void main(String[] args) {
        System.out.println("Choose Coffee Type or Exit!!");
        System.out.println("1. Cappuccino:150\n 2. Latte:120\n 3. Espresso:100\n 4.Amerciano:200\n Exit");
        Scnanner sc = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Enter Quantity:");
        CoffeeShop coffee = new CoffeeShop();
        switch(choice){
            case 1:
                coffee.generateBill(coffee.calculatePrice(150));
                Coffee.CoffeeTypes = "Cappuccino";  
                break;
            case 2:
                 coffee.generateBill(coffee.calculatePrice(120));
                Coffee.CoffeeTypes = "Latte";  
                break;
            case 3:
                coffee.generateBill(coffee.calculatePrice(100));
                Coffee.CoffeeTypes = "Espresso";  
                break;
            case 4:
                coffee.generateBill(coffee.calculatePrice(200));
                Coffee.CoffeeTypes = "Americano";  
                break;
            case 5:
                System.out.println("Thank you for visiting!!");
                return;
            default:
                System.out.println("Invalid choice!!");
        }
    }
}