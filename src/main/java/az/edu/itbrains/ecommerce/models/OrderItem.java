package az.edu.itbrains.ecommerce.models;


import jakarta.persistence.*;



@Entity
@Table(name = "order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    private Product product;
    @ManyToOne
    private Order order;
}
