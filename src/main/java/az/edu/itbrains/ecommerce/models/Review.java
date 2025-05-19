package az.edu.itbrains.ecommerce.models;

import jakarta.persistence.*;


import java.time.LocalDateTime;


@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;
    private int rank;

    private LocalDateTime createdDate;
    private boolean deleted;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;


}
