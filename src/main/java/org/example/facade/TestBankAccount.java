package org.example.facade;

public class TestBankAccount {

    public static void main(String[] args){
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        accessingBank.depositCash(5000);
        accessingBank.withdrawCash(50.00);
        accessingBank.withdrawCash(950.00);
        accessingBank.withdrawCash(5000.00);
    }

}
