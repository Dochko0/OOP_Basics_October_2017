package DefineBankAccountClass.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Main {
    private static HashMap<Integer, BankAccount> bankAccounts = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String[] line = bf.readLine().split(" ");
            if ("end".equalsIgnoreCase(line[0])) {
                break;
            }

            switch (line[0]) {
                case "Create":
                    createBankAccount(Integer.valueOf(line[1]));
                    break;
                case "Deposit":
                    depositSum(Integer.valueOf(line[1]), Double.valueOf(line[2]));
                    break;
                case "Withdraw":
                    withdrawSum(Integer.valueOf(line[1]), Double.valueOf(line[2]));
                    break;
                case "Print":
                   tryToPRint(Integer.valueOf(line[1]));
                    break;
            }
        }
    }

    private static void tryToPRint(Integer id) {
        if (bankAccounts.containsKey(id)) {
            System.out.println(bankAccounts.get(id));
        }else{
            System.out.println("Account does not exist");
        }
    }

    private static void withdrawSum(Integer id, Double amount) {
        if (bankAccounts.containsKey(id)) {
            bankAccounts.get(id).withdraw(amount);
        }else{
            System.out.println("Account does not exist");
        }
    }

    private static void depositSum(Integer id, Double amount) {
        if (bankAccounts.containsKey(id)) {
            bankAccounts.get(id).deposit(amount);
        }else{
            System.out.println("Account does not exist");
        }
    }

    //CREATE NA BANKACCOUNT
    private static void createBankAccount(Integer id) {
        if (bankAccounts.containsKey(id)) {
            System.out.println("Account already exists");
        } else {
            BankAccount ba = new BankAccount(id);
            bankAccounts.put(id, ba);
        }
    }

}
