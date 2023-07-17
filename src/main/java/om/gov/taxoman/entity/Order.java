package om.gov.taxoman.entity;


import lombok.Data;

@Data
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private OrderStatus status;

    @ManyToMany
    private List<Product> products;
}