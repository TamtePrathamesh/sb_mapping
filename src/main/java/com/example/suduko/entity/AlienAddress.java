package com.example.suduko.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Builder
@Table(name = "alien_address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlienAddress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "planet")
    private String planet;

    @OneToOne(mappedBy = "alienAddress")
    private Alien alien;
}
