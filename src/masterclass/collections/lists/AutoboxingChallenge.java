package masterclass.collections.lists;

import java.sql.Array;
import java.util.ArrayList;

public class AutoboxingChallenge {
    public static void main(String[] args) {
        Bank usaa = new Bank("USAA");
        Customer mdc = new Customer("Michael", 100d);
        usaa.addCustomer(mdc);
        usaa.addTransaction(mdc.name(),730.50);
        usaa.addTransaction(mdc.name(), -100);
        usaa.addTransaction(mdc.name(), -1e4); // insufficient funds
        usaa.addTransaction(mdc.name(), -32.67);
        usaa.addTransaction(mdc.name(), -18.54);
        usaa.printStatement(mdc.name());
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    protected Customer getCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.name().equals(name)) return customer;
        }

        System.out.printf("Customer \"%s\" not found.%n", name);
        return null;
    }

    protected boolean addCustomer(Customer customer) {
        if (getCustomer(customer.name()) != null) return false;
        customers.add(customer);
        System.out.printf("Welcome to %s Bank, %s%n", name, customer.name());
        return true;
    }

    protected boolean addTransaction(String name, double amount) {
        Customer customer = getCustomer(name);
        if (customer == null) return false;
        double balance = getBalance(customer);
        if (balance + amount < 0) {
            System.out.printf("Sorry, %s, insufficient funds to complete transaction of $%.2f.%n", customer.name(), amount);
            return false;
        }
        customer.transactions().add(amount);
        System.out.printf("Transaction complete: $%.2f%n", amount);
        return true;
    }

    protected double getBalance(Customer customer) {
        double balance = 0d;
        for (Double transaction : customer.transactions()) {
            balance += transaction;
        }

        return balance;
    }

    protected void printStatement(String name) {
        Customer customer = getCustomer(name);
        if (customer == null) return;
        System.out.printf("%s's Transactions: %n", customer.name());
        for (Double transaction : customer.transactions()) {
            String transactionType = transaction < 0 ? "Debit" : "Credit";
            String amount = String.format("$%.2f", transaction);
            int padCount = 20 - transactionType.length() - amount.length();
            String pad = " ".repeat(padCount);
            System.out.printf("%s %s %s%n", transactionType, pad, amount);
        }
    }
}

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name, new ArrayList<>(500));
        transactions.add(initialDeposit);
    }
}