package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "personList")
    private List<Address> addressList = new ArrayList<>();

    private List<CreditCard> creditCardList = new ArrayList<CreditCard>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Address> getAddressList() {
        return this.addressList;
    }

    @OneToMany
    public List<CreditCard> getCreditCardList() {
        return this.creditCardList;
    }

    public void setCreditCardList(List<CreditCard> creditCard) {
        this.creditCardList = creditCard;
    }
}
