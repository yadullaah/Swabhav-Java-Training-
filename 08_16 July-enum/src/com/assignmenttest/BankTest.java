package com.assignmenttest;

import com.assignmentmodel.Bank;
import java.util.Scanner;

public class BankTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank account1 = new Bank(1001, "Sharukh", 1000, AccountType.CURRENT);
        Bank account2 = new Bank(1002, "Salman", 2000, AccountType.SAVINGS);
        Bank account3 = new Bank(1003, "Ranbir", 3000, AccountType.SAVINGS);
        Bank account4 = new Bank(1004, "Akshay", 4000, AccountType.CURRENT);

        Bank accounts [] = {account1, account2, account3, account4};

        System.out.println("Select your Name: ");
        System.out.println("1. " + account1.getAccountHolderName());
        System.out.println("2. " + account2.getAccountHolderName());
        System.out.println("3. " + account3.getAccountHolderName());
        System.out.println("4. " + account4.getAccountHolderName());

        int nameChoice = sc.nextInt();

        Bank selectedAccount;
        switch (nameChoice) {
            case 1:
                selectedAccount = account1;
                break;
            case 2:
                selectedAccount = account2;
                break;
            case 3:
                selectedAccount = account3;
                break;
            case 4:
                selectedAccount = account4;
                break;
            default:
                System.out.println("Enter Valid Choice");
                return;
        }

        selectedAccount.Menu();
        int choice = sc.nextInt();

        while (choice != 6) {
            switch (choice) {
                case 1:
                    System.out.println("Balance: " + selectedAccount.getAccountBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit: ");
                    selectedAccount.amountDeposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw: ");
                    selectedAccount.amountWithdraw(sc.nextDouble());
                    break;
                case 4:
                	System.out.println("Account Number: " + selectedAccount.getAccountNumber());
                    break;
                case 5:
                	System.out.println("Account Type: " + selectedAccount.getAccountType());
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
            selectedAccount.Menu();
            choice = sc.nextInt();
        }

        System.out.println("Thank you for using the ATM. Visit Again!!!");

    
        Bank maxAccount = getMaximumBalanceAccount(accounts);
        if (maxAccount != null) {
            System.out.println("Account with Maximum Balance:");
            System.out.println(maxAccount.getAccountHolderName());
            System.out.println(maxAccount.getAccountBalance());

        } else {
            System.out.println("No accounts available.");
        }
    }

    public static Bank getMaximumBalanceAccount(Bank[] accounts) {
        if (accounts.length == 0) {
            return null;
        }

        Bank maxAccount = accounts[0];
        for (int i = 0; i< accounts.length ; i++) {
            if (accounts[i].getAccountBalance() > maxAccount.getAccountBalance()) {
                maxAccount = accounts[i];
            }
        }
        return maxAccount;
    }
}
