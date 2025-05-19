package az.edu.itbrains.ecommerce.models;

import jakarta.persistence.*;



@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String photoUrl;

    @ManyToOne
    private Product product;
}
