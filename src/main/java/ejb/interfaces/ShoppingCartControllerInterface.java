package ejb.interfaces;
import jpa.ShoppingCart;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by paisanrietbroek on 19/11/2016.
 */

@Remote
public interface ShoppingCartControllerInterface {

    void create(ShoppingCart shoppingCart);
    ShoppingCart read(long id);
    void update(String name, long id);
    void delete(Long id);

    List readAll();

}
