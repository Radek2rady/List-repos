package com.greenfoxacademy.bankofsimba.repositories;

import com.greenfoxacademy.bankofsimba.models.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
    private List<BankAccount> bankAccounts;

    public AnimalRepository() {
        bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("Simba", 2000.00, "lion", "King"));
        bankAccounts.add(new BankAccount("Mufasa", 1700.00, "lion", "King"));
        bankAccounts.add(new BankAccount("Nala", 1500.00, "lion", "King"));
        bankAccounts.add(new BankAccount("Beshte", 1500.00, "hippopotamus", "King"));
        bankAccounts.add(new BankAccount("Pumbaa", 1400.00, "pig", "King"));
        bankAccounts.add(new BankAccount("Timon", 1400.00, "meerkat", "King"));
    }

    public void addAnimal(BankAccount bankAccount) {
        this.bankAccounts.add(bankAccount);
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
