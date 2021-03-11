package com.bearRobotics;

// An ATM class represent an ATM machine
public class ATM {
    enum Operations{
        SeeBalance,
        Deposit,
        Withdraw
    }

    // ATM attributes
    private static Account currentAccount;
    private static String cardID;
    private static boolean isVerifyPIN;

    ATM(){
        // ATM constructor right here
    }

    protected String getPIN(){
        // Get user PIN input from the ATM
        // Assume PIN is 123456
        String pin = "123456";
        return pin;
    };


    protected boolean verifyPIN(String pin){
        // Somehow do the verification with bank system
        return false;
    };

    public static boolean isIsVerifyPIN() {
        return isVerifyPIN;
    }

    public static void setIsVerifyPIN(boolean isVerifyPIN) {
        ATM.isVerifyPIN = isVerifyPIN;
    }

    protected void insertCard(Card card){
        // somehow read the cardID
        cardID = "123456";
        card.getListOfAccountsFromBank(cardID);
    };

    protected void selectAccount(Card card, int accountIndex){
        setCurrentAccount(card.getAccountByIndex(accountIndex));
    };

    protected int getBalance(){
        return currentAccount.getBalance();
    }

    protected boolean deposit(int amount){
        // if successful deposit return true
        return currentAccount.deposit(amount);
    };

    protected boolean withdraw(int amount){
        // if success withdraw return true
        return currentAccount.withdraw(amount);
    };


    protected String getCurrentAccountID() {
        return currentAccount.getAccountID();
    }

    protected void setCurrentAccount(Account currentAccount) {
        ATM.currentAccount = currentAccount;
    }
}
