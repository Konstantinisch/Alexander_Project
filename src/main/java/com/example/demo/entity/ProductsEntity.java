package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProductsEntity {

    @Id
    @Column(name = "ProductID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;

    @Column(name = "UserId")
    private long userId;

    @Column(name = "name_of_product")
    private String nameOfProduct;

    @ManyToOne
    @JoinColumn(name = "productsUser")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "productsProduct")
    private CategoryEntity category;


}
