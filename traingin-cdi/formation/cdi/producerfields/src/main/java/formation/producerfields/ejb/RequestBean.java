
package formation.producerfields.ejb;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import formation.producerfields.db.UserDatabase;
import formation.producerfields.entity.ToDo;
import javax.ejb.EJBException;
import javax.ejb.Stateful;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ConversationScoped
@Stateful
public class RequestBean {

    @Inject
    @UserDatabase
    EntityManager em;

    public ToDo createToDo(String inputString) {
        ToDo toDo;
        Date currentTime = Calendar.getInstance().getTime();

        try {
            toDo = new ToDo();
            toDo.setTaskText(inputString);
            toDo.setTimeCreated(currentTime);
            em.persist(toDo);
            return toDo;
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
    }

    public List<ToDo> getToDos() {
        try {
            List<ToDo> toDos =
                    (List<ToDo>) em.createQuery(
                    "SELECT t FROM ToDo t ORDER BY t.timeCreated")
                    .getResultList();
            return toDos;
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
    }
}
