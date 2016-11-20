package ejb;

import ejb.interfaces.ShoppingCartControllerInterface;
import jpa.OrderItem;
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
    public void create(ShoppingCart shoppingCart) {
        em.persist(shoppingCart);

        // work-around
        em.flush();
        for (OrderItem i : shoppingCart.getOrderItemCollection()) {
            i.setShoppingCart(shoppingCart);
        }
    }

    @Override
    public ShoppingCart read(long id) {
        return null;
    }

    @Override
    public void update(String name, long id) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List readAll() {
        return null;
    }
}
