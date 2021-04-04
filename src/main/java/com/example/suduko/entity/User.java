package com.example.suduko.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "user_model")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "uid" , cascade = CascadeType.ALL)
    private Set<Mobile> mobiles;

}
