package org.example;

public class Client extends Person {
    private Discount discount;
    public Client(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        if(gender == Gender.Female) discount = Discount.Female;
    }

    public Client(String name, Gender gender, Discount discount) {
        this(name, gender);
        this.discount = discount;
    }


}
