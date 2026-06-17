public class ElectricityBill {
    double Units;
    public double electricityBill(double units){
        double amount =(Units <= 50) ? 5:(Units <= 100)?10:(Units <=200)? 15:(Units <=300)?20:30;
        return amount;


        
    }
    // generate bill
    public void generateBill(double units, double amount){
        
        System.out.println("-------------------------------------------------------");
        System.out.println("WELCOME TO ELECTRICITY BOARD");
        System.out.println("TOTALUNITS CONSUMED ->"+ units);
        System.out.println("TOTAL BILL AMOUNT ->"+ amount);
        System.out.println("-------------------------------------------------------");
    }
    public static void main (String[] args) {
        ElectricityBill elec = new ElectricityBill();
        Scanner sc = new Scanner(System.in);
        double amount = elec.electricityBill(elec.Units = sc.nextDouble());
        double totalAmount =  elec.Units*amount;
    }
}