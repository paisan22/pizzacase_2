package ejb.interfaces;

import jpa.OrderItem;
import jpa.Pizza;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by paisanrietbroek on 20/11/2016.
 */
@Remote
public interface OrderItemControllerInterface {

    void create(OrderItem orderItem);
    OrderItem read(long id);
    void update(int amount, long pizzaId, long orderItemId);
    void delete(Long id);

    List readAll();
}
