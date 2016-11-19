package ejb;

import jpa.Pizza;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by paisanrietbroek on 18/11/2016.
 */

@Remote
public interface PizzaControllerInterface {
    Pizza add(Pizza p);
    Pizza remove(Long id);
    Pizza update(String name, long id);
    List getAll();
}
