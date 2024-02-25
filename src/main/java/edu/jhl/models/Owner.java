package edu.jhl.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ownerid;
    private String firstname,lastname;
    //un owner tiene muchos cars
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private List<Car> cars;
    public Owner() {
    }
}
