package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {
    private String name;
    private Double balance;
    private String animalType;
    private String owner;
    private String goodOrBad;

    public BankAccount(String name, Double balance, String animalType, String owner) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.owner = owner;

//        if (this.name.equals("Simba")) {
//            this.owner = "<b style=\"color:#ff3300\">KING</b>";
//        } else {
//            this.owner = "King";
//        }

//        int switchGoodOrBad = 2;
//        switch (switchGoodOrBad) {
//            case 1:
//                this.goodOrBad = "Bad Guy";
//                break;
//            case 2:
//                this.goodOrBad = "Good One";
//                break;
//        }

        if (this.balance >= 1000.00) {
            this.goodOrBad = "Good One";
        } else {
            this.goodOrBad = "Bad Guy";
        }
    }

    public void addAnimal(BankAccount bankAccount) {
        bankAccount.addAnimal(bankAccount);
    }

    public BankAccount() {
        this.name = "Simba";
        this.balance = 2000.00;
        this.animalType = "lion";
        this.owner = "King";

//        if (this.name.equals("Simba")) {
//            this.owner = "<b style=\"color:#ff3300\">KING</b>";
//        } else {
//            this.owner = "King";
//        }
        if (this.balance >= 1000.00) {
            this.goodOrBad = "Good One";
        } else {
            this.goodOrBad = "Bad Guy";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getGoodOrBad() {
        return goodOrBad;
    }

    public void setGoodOrBad(String goodOrBad) {
        this.goodOrBad = goodOrBad;
    }

}
