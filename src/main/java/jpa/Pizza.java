package jpa;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by paisanrietbroek on 18/11/2016.
 */

@Data
@NoArgsConstructor
@Entity(name = "pizza")
@NamedQueries({
    @NamedQuery(name = "updatePizza", query = "UPDATE pizza p SET p.name = :name WHERE p.id = :id"),
    @NamedQuery(name = "getAllPizza", query = "SELECT p FROM pizza p")
})
public class Pizza implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToOne(cascade = CascadeType.PERSIST, mappedBy = "pizza")
    private OrderItem orderItem;

}
