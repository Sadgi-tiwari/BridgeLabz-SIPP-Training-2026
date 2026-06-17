public ExceptionSSolution;
public class InsufficientBalanceException extends Exception {
    double balance;
    double withdrawAmount;
    public InsufficientBalanceException(double balance, double withdrawAmount) {
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
    }
    @Override
    public String getMessage() {
        return "Insufficient balance! \n Balance Amount: " + balance + ", Withdraw Amount : " + withdrawAmount;
    }   
}