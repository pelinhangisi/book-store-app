package com.pelinh.bookstore.entities;

import lombok.*;

import javax.persistence.*;

@Table
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Oluşturulacak olan kitapların ismi, yazarı, tutarı ve stok adeti database de görünecektir.
    private String name;
    private String author;
    private Double price;
    private Integer stock;

}
