package ejb;

import ejb.interfaces.ShoppingCartControllerInterface;
import jpa.ShoppingCart;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by paisanrietbroek on 19/11/2016.
 */

@Stateful
public class ShoppingCartController implements ShoppingCartControllerInterface {

    @PersistenceContext(unitName = "PizzaPU")
    private EntityManager em;

    @Override
    public ShoppingCart add(ShoppingCart o) {
        em.persist(o);
        return o;
    }

    @Override
    public ShoppingCart remove(Long id) {
        return null;
    }

    @Override
    public ShoppingCart update(String name, long id) {
        return null;
    }

    @Override
    public List<ShoppingCart> getAll() {
        return null;
    }
}
