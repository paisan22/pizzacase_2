package web;

import ejb.PizzaControllerInterface;
import jpa.Pizza;
import lombok.Data;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by paisanrietbroek on 18/11/2016.
 */

@Data
@Named("pizzaservice")
@SessionScoped
public class PizzaService implements Serializable {

    private long id;
    private String name;

    @EJB
    PizzaControllerInterface pizzaControllerInterface;

    public Pizza add(String name) {
        return pizzaControllerInterface.add(new Pizza(name));
    }

    public Pizza delete(long id) {
        return pizzaControllerInterface.remove(id);
    }

    public Pizza update(String name, long id) {
        return pizzaControllerInterface.update(name, id);
    }

    public List<Pizza> getAll() {
        return pizzaControllerInterface.getAll();
    }
}
