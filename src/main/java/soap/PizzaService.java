package soap;

import ejb.interfaces.PizzaControllerInterface;
import jpa.Pizza;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.io.Serializable;
import java.util.List;

/**
 * Created by paisanrietbroek on 19/11/2016.
 */

@Stateless
@WebService(name = "pizza_service")
public class PizzaService implements Serializable {

    @EJB
    PizzaControllerInterface pizzaControllerInterface;

    @WebMethod(operationName = "add")
    public void add(String name) {
        Pizza pizza = new Pizza();
        pizza.setName(name);
        pizzaControllerInterface.create(pizza);
    }

    @WebMethod(operationName = "delete")
    public void delete(long id) {
        pizzaControllerInterface.delete(id);
    }

    @WebMethod(operationName = "update")
    public void update(String name, long id) {
        pizzaControllerInterface.update(name, id);
    }

    @WebMethod(operationName = "getAll")
    public List<Pizza> getAll() {
        return pizzaControllerInterface.readAll();
    }
}
