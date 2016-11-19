package soap;

import ejb.PizzaControllerInterface;
import jpa.Pizza;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by paisanrietbroek on 19/11/2016.
 */

@WebService(name = "pizza_service")
public class PizzaService {

    @EJB
    PizzaControllerInterface pizzaControllerInterface;

    @WebMethod(operationName = "add")
    public Pizza add(String name) {
        return pizzaControllerInterface.add(new Pizza(name));
    }

    @WebMethod(operationName = "delete")
    public Pizza delete(long id) {
        return pizzaControllerInterface.remove(id);
    }

    @WebMethod(operationName = "update")
    public Pizza update(String name, long id) {
        return pizzaControllerInterface.update(name, id);
    }

    @WebMethod(operationName = "getAll")
    public List<Pizza> getAll() {
        return pizzaControllerInterface.getAll();
    }
}
