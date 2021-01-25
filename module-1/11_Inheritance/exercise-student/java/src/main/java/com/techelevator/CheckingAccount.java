package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int transaction = super.getBalance() - amountToWithdraw;
        if (transaction < 0 && transaction > -100) {
            super.withdraw(amountToWithdraw + 10);
        } if (transaction >= 0) {
            super.withdraw(amountToWithdraw);
        } return super.getBalance();
    }
}
