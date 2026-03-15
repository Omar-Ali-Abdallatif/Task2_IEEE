package accounts;

public class BankAccountExample2 {
    private String owner;
    private double balance;

    private final String warningMessage = "your Balance is Not Enough and Not allowed be Negative";

    public BankAccountExample2(String owner, double balance){
        this.owner = owner;
        checkBalance(balance);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getWarningMessage() {
        return warningMessage;
    }

    public String checkBalance (double balance){
        if (balance >= 0){
            this.balance = balance;
            return "";
        }
        return warningMessage;
    }

    public static void transferMoney(BankAccountExample2 firstAccount, BankAccountExample2 secondAccount, double amountt, int transferNumber){
        if (firstAccount.getBalance() >= amountt){
            firstAccount.setBalance(firstAccount.getBalance()-amountt);
            secondAccount.setBalance(secondAccount.getBalance()+amountt);
            System.out.println("Transaction " + transferNumber + " Completed");
        }else {
            System.out.println("Transaction " + transferNumber + " Failed");
        }
        System.out.println( firstAccount.getOwner() + " balance: " + firstAccount.getBalance());
        System.out.println(secondAccount.getOwner() + " balance: " + secondAccount.getBalance());
    }

}
