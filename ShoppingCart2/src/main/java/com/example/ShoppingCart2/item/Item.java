package com.example.ShoppingCart2.item;

import com.sun.istack.NotNull;
import lombok.*;
//import org.hibernate.annotations.Size;

import javax.persistence.*;

@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="item1")
public class Item {
@Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "name")
    String name;
    @NotNull

    @Column(name = "price")
    Double price;
    @Column(name = "quantity")
    Integer quantity;
    @Column(name = "brand")
    String brand;


}
