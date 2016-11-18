package ejb;

import jpa.Pizza;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Created by paisanrietbroek on 18/11/2016.
 */
@Singleton
@Startup
public class setup {
    @EJB
    private PizzaControllerInterface pizzaControllerInterface;

    @PostConstruct
    public void create() {
        pizzaControllerInterface.add(new Pizza("Funghi"));
        pizzaControllerInterface.add(new Pizza("Mozzerella"));
    }
}
