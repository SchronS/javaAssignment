package JavaAssignment.donations.model;

import javax.persistence.*;

@Entity
@Table(name = "donations")
public class donation {

    private int id;
    private String name;
    private String surname;
    private int amount;
    private String currency;

    public donation(){

    }

    public donation(String name, String surname, int amount, String currency){
        this.name = name;
        this.surname = surname;
        this.amount = amount;
        this.currency = currency;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "amount")
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Column(name = "currency")
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
