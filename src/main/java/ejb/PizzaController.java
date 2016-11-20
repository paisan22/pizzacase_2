package ejb;

import ejb.interfaces.PizzaControllerInterface;
import jpa.Pizza;
import lombok.NoArgsConstructor;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by paisanrietbroek on 18/11/2016.
 */

@NoArgsConstructor
@Stateful
public class PizzaController implements PizzaControllerInterface {

    @PersistenceContext(unitName = "PizzaPU")
    private EntityManager em;

    @Override
    public void create(Pizza p) {
        em.persist(p);
    }

    @Override
    public Pizza read(long id) {
        Pizza pizza = em.find(Pizza.class, id);
        return pizza;
    }

    @Override
    public void update(String name, long id) {
        em.createNamedQuery("updatePizza", Pizza.class).setParameter("name", name).setParameter("id", id).executeUpdate();
    }

    @Override
    public void delete(Long id) {
        Pizza pizza = em.find(Pizza.class, id);
        em.remove(pizza);
    }

    @Override
    public List readAll() {
        return em.createNamedQuery("getAllPizza").getResultList();
    }
}
