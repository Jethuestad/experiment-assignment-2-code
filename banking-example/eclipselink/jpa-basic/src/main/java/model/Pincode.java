package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String pincode;
    private int count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
