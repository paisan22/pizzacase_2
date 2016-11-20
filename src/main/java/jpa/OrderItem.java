package jpa;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by paisanrietbroek on 19/11/2016.
 */

@Data
@Entity(name = "order_item")
@NamedQueries({
        @NamedQuery(name = "updateOrderItem", query = "UPDATE order_item oi " +
                "SET oi.pizza = :pizza, oi.amount = :amount " +
                "WHERE oi.id = :id"),
        @NamedQuery(name = "getAllOrderItem", query = "SELECT oi FROM order_item oi")
})
public class OrderItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn
    private Pizza pizza;

    private int amount;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn
    private ShoppingCart shoppingCart;
}
