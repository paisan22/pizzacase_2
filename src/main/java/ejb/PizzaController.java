package ejb;

import jpa.Pizza;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by paisanrietbroek on 18/11/2016.
 */

@Stateless
public class PizzaController implements PizzaControllerInterface {

    @PersistenceContext(unitName = "PizzaPU")
    private EntityManager em;

    public Pizza add(Pizza p) {
            em.persist(p);
            return p;
    }
}
