package app;

import accounts.BankAccount;

public class BankApp {
    void main(){
        BankAccount mohamed = new BankAccount("Mohamed", 1000);
        BankAccount ahmed = new BankAccount("Ahmed", 500);

        double amount = 1500;

        mohamed.setBalance(mohamed.getBalance()-amount);
        ahmed.setBalance(ahmed.getBalance()+amount);

        System.out.println("Mohamed is balance: " + mohamed.getBalance());
        System.out.println("Ahmed is balance: " + ahmed.getBalance());
    }
}


