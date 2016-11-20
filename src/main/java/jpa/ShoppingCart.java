package jpa;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by paisanrietbroek on 19/11/2016.
 */

@Data
@NoArgsConstructor
@Entity(name = "shopping_cart")
public class ShoppingCart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @OneToMany(mappedBy = "shoppingCart", cascade = CascadeType.PERSIST)
//    private Collection<OrderItem> orderItemCollection;

}
