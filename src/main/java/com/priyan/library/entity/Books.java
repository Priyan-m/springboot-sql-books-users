package com.priyan.library.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Books {
    @Id
    @GeneratedValue
    private long id;
    private String author;
    private String bookName;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User borrowedBy;

}
