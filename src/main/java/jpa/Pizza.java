package jpa;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Repeatable;

/**
 * Created by paisanrietbroek on 18/11/2016.
 */

@Data
@NoArgsConstructor
@Entity(name = "pizza")
@NamedQueries({
    @NamedQuery(name = "update", query = "UPDATE pizza p SET p.name = :name WHERE p.id = :id"),
    @NamedQuery(name = "getAll", query = "SELECT p FROM pizza p")
})


public class Pizza implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    public Pizza(String name) {
        this.name = name;
    }
}
