package ejb;

import ejb.interfaces.OrderItemControllerInterface;
import ejb.interfaces.PizzaControllerInterface;
import jpa.OrderItem;
import jpa.Pizza;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.Serializable;


/**
 * Created by paisanrietbroek on 18/11/2016.
 */
@Data
@NoArgsConstructor
@Singleton
@Startup
public class setup implements Serializable {

    @EJB
    private PizzaControllerInterface pizzaControllerInterface;

    @EJB
    private OrderItemControllerInterface orderItemControllerInterface;

    @PostConstruct
    public void create() {

        try {
            // create 3 pizzas
            Pizza pizza = new Pizza();
            pizza.setName("pizza 0");

            Pizza pizza1 = new Pizza();
            pizza1.setName("pizza 1");

            Pizza pizza2 = new Pizza();
            pizza2.setName("pizza 2");

            pizzaControllerInterface.create(pizza);
            pizzaControllerInterface.create(pizza1);
            pizzaControllerInterface.create(pizza2);

            // create 2 order items
            OrderItem orderItem = new OrderItem();
            orderItem.setPizza(pizzaControllerInterface.read(1));
            orderItem.setAmount(6);

            OrderItem orderItem1 = new OrderItem();
            orderItem1.setPizza(pizzaControllerInterface.read(3));
            orderItem1.setAmount(8);

            orderItemControllerInterface.create(orderItem);
            orderItemControllerInterface.create(orderItem1);
        } catch (Exception ex) {
            System.out.println("setup error: " + ex.getMessage());
        }

    }
}
