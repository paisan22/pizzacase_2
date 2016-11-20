package web;

import ejb.interfaces.PizzaControllerInterface;
import jpa.Pizza;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by paisanrietbroek on 18/11/2016.
 */

@Data
@Named("pizza_service")
@NoArgsConstructor
@SessionScoped
public class PizzaService implements Serializable {

    private long id;
    private String name;

    @EJB
    private PizzaControllerInterface pizzaControllerInterface;

    public void add(String name) {
        Pizza pizza = new Pizza();
        pizza.setName(name);
        pizzaControllerInterface.create(pizza);
    }

    public void delete(long id) {
        pizzaControllerInterface.delete(id);
    }

    public void update(String name, long id) {
        pizzaControllerInterface.update(name, id);
    }

    public List getAll() {
        return pizzaControllerInterface.readAll();
    }
}
