package com.techelevator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Accountable[] getAccounts() {
        return accounts.toArray(new Accountable[0]);
    }

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    @Override
    public int getBalance() {
        return 0;
    }

   public boolean isVip() {
        boolean vip = false;
        int vipRequirement = 25000;
        int accountSum = 0;

        for (Accountable balance : accounts) {
            accountSum = accountSum + balance.getBalance();
        }
        if (accountSum >= 25000) {
            vip = true;
       }
        return vip;
   }


}
