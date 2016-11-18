package webservices;

import ejb.PizzaControllerInterface;
import jpa.Pizza;
import lombok.NoArgsConstructor;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by paisanrietbroek on 18/11/2016.
 */
@NoArgsConstructor
@WebService(name = "pizza")
public class PizzaWebService {

    @EJB
    PizzaControllerInterface pizzaControllerInterface;

    @WebMethod(operationName = "add")
    public Pizza add(String name) {
        return pizzaControllerInterface.add(new Pizza(name));
    }
}
