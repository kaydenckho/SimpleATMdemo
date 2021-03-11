package com.bearRobotics;

import java.util.ArrayList;

//An Card class representing a ATM "card" object
public class Card {
    // attributes of an ATM card
    static int numberOfAccounts = 0;
    static ArrayList<Account> accounts;

    Card() {
        // Card constructor here
    }

    protected void getListOfAccountsFromBank(String cardID) {
        // somehow obtains the accounts from bank by cardID and store them
        // For example, I have a HKD account with $10 HK dollars & KWR account with 5000 WON:
        accounts = new ArrayList<>();
        Account account1 = new Account("HKD account", 10);
        accounts.add(account1);
        Account account2 = new Account("KRW account", 5000);
        accounts.add(account2);
    }


    protected Account getAccountByIndex(int index) {
        // get account by index
        if (index < accounts.size()) {
            return accounts.get(index);
        } else {
            // handle account out of index
            return null;
        }
    }
}
