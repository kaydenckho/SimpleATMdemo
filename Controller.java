package com.bearRobotics;

public class Controller{

    public static void main(String[] args) {
        // ATM flow:
        // Insert Card => PIN number => Select Account => See Balance/Deposit/Withdraw
        System.out.println("--- Simple ATM ---");
        ATM atm = new ATM();
        System.out.println("Please insert your card.");
        Card card = new Card();
        atm.insertCard(card);
        System.out.println("Inserting card...");
        System.out.println("Your card is inserted.\nPlease enter your PIN:");
        System.out.println("PIN is entered: ******:");
        String pin = atm.getPIN();
        ATM.setIsVerifyPIN(atm.verifyPIN(pin));
        if (ATM.isIsVerifyPIN()){
            System.out.println("Your PIN is verified.\nPlease select account: 1,2,3,4");
        }
        System.out.println("You selected account 1.\nPlease choose action: 1.See balance/2.Deposit/3.Withdraw");
        // convert user input to account index 0,1,2,3,4..
        // Assume I want to see my KWR account's balance
        atm.selectAccount(card, 1);
        // Here obtain user-inout for action
        // Assume I want to see balance
        // If you want to try other operations, please uncomment the below line

        ATM.Operations operation = ATM.Operations.SeeBalance;

//        ATM.Operations operation = ATM.Operations.Deposit;

//        ATM.Operations operation = ATM.Operations.Withdraw;

        int amount;
        switch (operation){
            case SeeBalance:
                System.out.println("Current account:"+atm.getCurrentAccountID());
                System.out.println("Balance:"+atm.getBalance());
                break;
            case Deposit:
                // Obtain the amount from user
                System.out.println("Enter deposit amount: 30");
                amount = 30;
                if (atm.deposit(amount)){
                    System.out.println("You have deposited "+amount+" dollars");
                    System.out.println("Balance:"+atm.getBalance());
                }
                else{
                    System.out.println("Not deposited");
                    System.out.println("Balance:"+atm.getBalance());
                }
                break;
            case Withdraw:
                // Obtain the amount from user
                amount = 10;
                System.out.println("Enter withdraw amount: 10");
                if (atm.deposit(amount)){
                    System.out.println("You have withdrawn "+amount+" dollars");
                    System.out.println("Balance:"+atm.getBalance());
                }
                else{
                    System.out.println("Not withdrawn");
                    System.out.println("Balance:"+atm.getBalance());
                }
        }
    }
}
