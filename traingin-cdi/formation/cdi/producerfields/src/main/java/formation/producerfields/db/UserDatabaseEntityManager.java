
package formation.producerfields.db;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class UserDatabaseEntityManager {

    // declare a producer field
    @Produces
    @UserDatabase 
    @PersistenceContext
    private EntityManager em;

    // use methods to create and dispose of a producer field
 /* @PersistenceContext
    private EntityManager em;

    @Produces
    @UserDatabase
    public EntityManager create() {
        return em;
    }

    public void close(@Disposes @UserDatabase EntityManager em) {
        em.close();
    } */
}
