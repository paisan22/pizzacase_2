package ejb;

import jpa.Pizza;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by paisanrietbroek on 18/11/2016.
 */

@Stateless
public class PizzaController implements PizzaControllerInterface {

    @PersistenceContext(unitName = "PizzaPU")
    private EntityManager em;

    @Override
    public Pizza add(Pizza p) {
            em.persist(p);
            return p;
    }

    @Override
    public Pizza remove(Long id) {
        Pizza pizza = em.find(Pizza.class, id);
        em.remove(pizza);
        return pizza;
    }

    @Override
    public Pizza update(String name, long id) {
        em.createNamedQuery("update").setParameter("name" , name).setParameter("id", id).executeUpdate();
        return em.find(Pizza.class, id);
    }

    @Override
    public List getAll() {
        return em.createNamedQuery("getAll").getResultList();
    }
}
