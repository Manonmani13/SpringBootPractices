package com.example.sb_data_rest_app;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="book_tbl")
public class Book {

    @Id
    
    private Integer bookId;

    private String  name;

    private Double price;


}
