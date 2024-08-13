package agilambal;

import java.util.ArrayList;
class Account {
private String name;
private String accountNumber;
private double balance;
public Account(String name, String accountNumber, double balance) {
   this.name = name;
   this.accountNumber = accountNumber;
   this.balance = balance;
}
public String getName() {
   return name;
}
public void setName(String name) {
   this.name = name;
}
public String getAccountNumber() {
   return accountNumber;
}
public void setAccountNumber(String accountNumber) {
   this.accountNumber = accountNumber;
}
public double getBalance() {
   return balance;
}
public void setBalance(double balance) {
   this.balance = balance;
}
public void deposit(double amount) {
   balance += amount;
}
public void withdraw(double amount) {
   if (balance >= amount) {
       balance -= amount;
   } else {
       System.out.println("Insufficient balance!");
   }
}
public String getAccountInfo() {
   return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
}
}
class Bank1{
private ArrayList<Account> accounts;
public Bank1() {
   accounts = new ArrayList<>();
}
public void addAccount(Account account) {
   accounts.add(account);
}
public void removeAccount(String accountNumber) {
   accounts.removeIf(account -> account.getAccountNumber().equals(accountNumber));
}
public void deposit(String accountNumber, double amount) {
   for (Account account : accounts) {
       if (account.getAccountNumber().equals(accountNumber)) {
           account.deposit(amount);
           return;
       }
   }
   System.out.println("Account not found!");
}
public void withdraw(String accountNumber, double amount) {
   for (Account account : accounts) {
       if (account.getAccountNumber().equals(accountNumber)) {
           account.withdraw(amount);
           return;
       }
   }
   System.out.println("Account not found!");
}
public void displayAccounts() {
   for (Account account : accounts) {
       System.out.println(account.getAccountInfo());
   }
}
}
public class Bank {
	public static void main(String[] args) {
		Bank1 bank = new Bank1();
      Account account1 = new Account("Agila", "645454654984", 1000.0);
      Account account2 = new Account("Mowni", "645465845645", 1500.0);
      bank.addAccount(account1);
      bank.addAccount(account2);
      bank.displayAccounts();
      System.out.println("Deposited Money");
      bank.deposit("A001", 5000.000);
      bank.withdraw("A002", 200.0);
      bank.displayAccounts();
      bank.removeAccount("A001");
      bank.displayAccounts();
	}
}