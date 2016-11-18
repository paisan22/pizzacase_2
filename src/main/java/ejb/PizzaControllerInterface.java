package ejb;

import jpa.Pizza;

import javax.ejb.Remote;

/**
 * Created by paisanrietbroek on 18/11/2016.
 */

@Remote
public interface PizzaControllerInterface {
    Pizza add(Pizza p);
}
