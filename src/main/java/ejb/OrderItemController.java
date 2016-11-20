package ejb;

import ejb.interfaces.OrderItemControllerInterface;
import jpa.OrderItem;
import jpa.Pizza;
import lombok.NoArgsConstructor;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by paisanrietbroek on 19/11/2016.
 */

@Stateful
@Remote(OrderItemControllerInterface.class)
@NoArgsConstructor
public class OrderItemController implements OrderItemControllerInterface {

    @PersistenceContext(name = "PizzaPU")
    private EntityManager em;

    @Override
    public void create(OrderItem orderItem) {
        em.persist(orderItem);
    }

    @Override
    public OrderItem read(long id) {
        OrderItem orderItem = em.find(OrderItem.class, id);
        return orderItem;
    }

    @Override
    public void update(int amount, long pizzaId, long orderItemId) {
        Pizza pizza = em.find(Pizza.class, pizzaId);
        em.createNamedQuery("updateOrderItem", OrderItem.class)
                .setParameter("pizza", pizza)
                .setParameter("amount", amount)
                .setParameter("id", orderItemId)
                .executeUpdate();
    }

    @Override
    public void delete(Long id) {
        OrderItem orderItem = em.find(OrderItem.class, id);
        em.remove(orderItem);
    }

    @Override
    public List readAll() {
        return em.createNamedQuery("getAllOrderItem").getResultList();
    }
}
