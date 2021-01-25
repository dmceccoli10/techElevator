package com.techelevator;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (amountToWithdraw >= super.getBalance()) {
            return super.getBalance();
        } else if
        (super.getBalance() - amountToWithdraw < 150 && super.getBalance() - amountToWithdraw >= 0) {
            super.withdraw(amountToWithdraw + 2);
            return super.getBalance();
        } else {
            super.withdraw(amountToWithdraw);
        }
        return getBalance();
    }
}

