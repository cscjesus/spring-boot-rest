package edu.jhl.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private  String brand,model,color,registerNumber;
    private int modelYear,price;

    //relacion muchos cars un owner
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner")
    private Owner owner;
    public Car(String brand, String model, String color, String registerNumber, int modelYear, int price,Owner owner) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.modelYear = modelYear;
        this.price = price;
        this.owner= owner;
    }

    public Car() {

    }
}
