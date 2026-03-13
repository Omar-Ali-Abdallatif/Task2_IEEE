package app;

import accounts.BankAccount;
import accounts.BankAccountExample2;

public class BankAppExample2 {
    void main(){
        BankAccountExample2 mohamed = new BankAccountExample2("Mohamed", 1000);
        BankAccountExample2 ahmed = new BankAccountExample2("Ahmed", 500);

        double amount1 = 1500;
        double amount2 = 1200;

        BankAccountExample2.sss(mohamed,ahmed,amount1,1);
        System.out.println();
        BankAccountExample2.sss(mohamed,ahmed,amount2,2);

    }
}
