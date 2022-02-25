package org.example.facade;

public class AccountNumberCheck{

    private int accountNumber = 12345678;
    private double cashInAccount = 1000.00;

    public int getAccountNumber() { return accountNumber; }

    public boolean accountActive(int acctNumToCheck){

        if(acctNumToCheck == getAccountNumber()) {
            return true;
        } else {
            return false;
        }
    }

    public double getCashInAccount() { return cashInAccount; }

    public void decreaseCashInAccount(double cashWithdrawn) { cashInAccount -= cashWithdrawn; }

    public void increaseCashInAccount(double cashDeposited) { cashInAccount += cashDeposited; }

    public boolean haveEnoughMoney(double cashToWithdrawal) {
        if(cashToWithdrawal > getCashInAccount()) {
            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getCashInAccount());
            return false;
        } else {
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Withdrawal Complete: Current Balance is " + getCashInAccount());
            return true;
        }
    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());
    }

}
