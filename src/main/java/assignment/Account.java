package assignment;
import java.util.Scanner;

public class Account {
    private double balance;
    //Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    //dibit amount of account
    public void debit(double debitAmount) {
        if (debitAmount > balance) {
            System.out.println("Debit amount exceeded account balance. ");
            System.out.println("Available balance : " +getBalance());
        } else {
            balance = balance - debitAmount;
            System.out.println(getBalance());
        }

    }
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account a = new Account(500);
        a.debit(700);
    }
}
