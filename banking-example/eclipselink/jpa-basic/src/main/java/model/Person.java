package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String name;

    private Address address;

    private List<CreditCard> creditCardList = new ArrayList<CreditCard>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @OneToMany
    public List<CreditCard> getCreditCardList() {
        return this.creditCardList;
    }

    public void setCreditCardList(List<CreditCard> creditCard) {
        this.creditCardList = creditCard;
    }
}
