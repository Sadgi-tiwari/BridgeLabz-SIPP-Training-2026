package EXceptionSolution;
public class Atm{
    private double balance = 10000;
    public void withdraw(double amount ) throws InsufficientBalanceException{
        if(amount > balance ){
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
        System.out.println("Balance After withdraw of Amount: " + amount+"is: "+balance);
        }
        public static void main(String[] args) {
            Atm atm = new Atm();
            try{
                atm.withdraw(5000);
            }catch(InsufficientBalanceException e){
                System.out.println(e.getMessage());
                printstackTrace();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                printstackTrace();
            }
        }

    }
