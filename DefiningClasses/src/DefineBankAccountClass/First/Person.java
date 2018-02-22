package DefineBankAccountClass.First;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<BankAccount> bankAccounts;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, List<BankAccount> bankAccounts) {
        this(name, age);
        this.bankAccounts = bankAccounts;
    }
    
    public double getBalance() {
        double sum = 0L;
        for (BankAccount bankAccount : bankAccounts) {
            sum+= bankAccount.getBalance();

        }
        return sum;
    }
    
}
