package jpa;

import lombok.AllArgsConstructor;
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
public class Pizza implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    public Pizza(String name) {
        this.name = name;
    }
}
