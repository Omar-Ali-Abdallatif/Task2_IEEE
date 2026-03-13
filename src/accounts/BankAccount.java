package accounts;

public class BankAccount {

    private String accountHolder;
    private double balance;
    private final String warningMessage = "your Balance is Not Enough and Not allowed be Negative";

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        checkBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        checkBalance(balance);
    }

    public String checkBalance (double balance){
        if (balance >= 0){
            this.balance = balance;
            return "";
        }
        return warningMessage;
    }

}
