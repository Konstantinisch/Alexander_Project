package com.example.demo.entity;

import com.example.demo.entity.embedded.DataPassport;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserEntity {

    @Id
    @Column(name = "UserID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Password")
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<ProductsEntity> productsUser = new HashSet<>();
}
