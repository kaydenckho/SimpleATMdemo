package com.bearRobotics;

public class Account {
    private String accountID;
    private int balance; // $1 bills no cents so int

    Account(String accountID, int balance){
        // Account constructor here
        setAccountID(accountID);
        setBalance(balance);
    }

    protected String getAccountID() {
        return accountID;
    }

    protected void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    protected int getBalance() {
        return balance;
    }

    protected boolean deposit(int amount){
        // May set some conditions for deposit and return a flag whether successful or not
        balance += amount;
        return true;
    }

    protected boolean withdraw(int amount){
        // balance should not be negative
        if ((balance - amount) > 0 ){
            balance -= amount;
            return true;
        }
        else{
            return false;
        }
    }

    private void setBalance(int balance){
        this.balance = balance;
    }

    private void obtainBalanceFromBank(String accountID){
        //obtain balance from bank by accountID
        int balance = 0;
        setBalance(balance);
    }

}
