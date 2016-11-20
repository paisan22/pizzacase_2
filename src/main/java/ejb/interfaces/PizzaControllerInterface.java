package ejb.interfaces;

import jpa.Pizza;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by paisanrietbroek on 18/11/2016.
 */

@Remote
public interface PizzaControllerInterface {

    void create(Pizza p);
    Pizza read(long id);
    void update(String name, long id);
    void delete(Long id);

    List readAll();
}
