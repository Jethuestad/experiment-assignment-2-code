package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private int number;
    private int Balance;
    private int Limit;

    private Pincode pincode;

    private Bank bank;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public int getLimit() {
        return Limit;
    }

    public void setLimit(int limit) {
        Limit = limit;
    }

    @ManyToOne
    public Pincode getPincode() {
        return pincode;
    }

    public void setPincode(Pincode pincode) {
        this.pincode = pincode;
    }
}
