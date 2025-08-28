package com.priyan.library.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Borrow {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name="book_id")
    private Books books;
    private LocalDate borrowDate;
    private LocalDate returnDate;


}
