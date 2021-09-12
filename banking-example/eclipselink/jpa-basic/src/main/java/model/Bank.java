package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String name;

    @OneToMany(mappedBy = "bank")
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

    public void setCreditCardList(List<CreditCard> creditCards) {
        this.creditCardList = creditCards;
    }
}
