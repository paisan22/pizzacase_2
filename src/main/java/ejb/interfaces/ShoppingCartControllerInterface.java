package ejb.interfaces;
import jpa.ShoppingCart;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by paisanrietbroek on 19/11/2016.
 */

@Remote
public interface ShoppingCartControllerInterface {

    ShoppingCart add(ShoppingCart o);
    ShoppingCart remove(Long id);
    ShoppingCart update(String name, long id);
    List<ShoppingCart> getAll();

}
