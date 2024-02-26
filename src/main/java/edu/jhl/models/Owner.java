package edu.jhl.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ownerid;
    private String firstname,lastname;
    //un owner tiene muchos cars
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    @JsonIgnore//evitar ciclo infinito
    private List<Car> cars;
    public Owner() {
    }
}
