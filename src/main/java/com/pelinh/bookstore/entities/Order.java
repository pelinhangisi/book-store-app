package com.pelinh.bookstore.entities;


import lombok.*;

import javax.persistence.*;
import java.util.List;


@Table
@Data
@Getter
@Setter
@Builder
@Entity (name = "bookOrder") // Order db ortamında bir request ismi olması sebebiyle tablodaki isminin değiştirilmesi gerekir.
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String userName;

    @Column
    @ElementCollection(targetClass=Integer.class)
    private List<Integer> bookIdList;

    private Double totalPrice;

}
