package com.example.suduko.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Builder
@Data
@Table(name = "alien")
@AllArgsConstructor
@NoArgsConstructor

public class Alien implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "powers")
    private String powers;

    @OneToOne(cascade = CascadeType.ALL)
    private AlienAddress alienAddress;
}
