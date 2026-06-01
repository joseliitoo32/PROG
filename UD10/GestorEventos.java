import javax.persistence.*;
import java.util.List;

public class GestorEventos {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventos.odb");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        // --- EJERCICIO 4: Insertar ---
        em.getTransaction().begin();
        EventoMusical e1 = new EventoMusical("Rock Fest", ...);
        EventoMusical e2 = new EventoMusical("Jazz Night", ...);
        em.persist(e1);
        em.persist(e2);
        em.getTransaction().commit();

        // --- EJERCICIO 5: Imprimir ---
        // Identificador
        EventoMusical ev1 = em.find(EventoMusical.class, e1.getId());

        // JPQL Estática (Query)
        TypedQuery<EventoMusical> q1 = em.createQuery("SELECT e FROM EventoMusical e WHERE e.id = 2", EventoMusical.class);
        EventoMusical ev2 = q1.getSingleResult();

        // JPQL Dinámica
        TypedQuery<EventoMusical> q2 = em.createQuery("SELECT e FROM EventoMusical e WHERE e.id = :id", EventoMusical.class);
        q2.setParameter("id", 2L);
        EventoMusical ev2Dinamica = q2.getSingleResult();

        // --- EJERCICIO 6: Cambiar nombre ---
        em.getTransaction().begin();
        // Identificador
        ev1.setNombre(ev1.getNombre().toUpperCase());

        // JPQL Estática
        em.createQuery("UPDATE EventoMusical e SET e.nombre = 'JAZZ NIGHT' WHERE e.id = 2").executeUpdate();

        // JPQL Dinámica
        Query qUpdate = em.createQuery("UPDATE EventoMusical e SET e.nombre = :nombre WHERE e.id = :id");
        qUpdate.setParameter("nombre", "JAZZ NIGHT");
        qUpdate.setParameter("id", 2L);
        qUpdate.executeUpdate();
        em.getTransaction().commit();

        // --- EJERCICIO 7: Eliminar ---
        em.getTransaction().begin();
        // Copia y borrado por ID
        EventoMusical copia = new EventoMusical(ev1);
        em.persist(copia);
        em.remove(ev1);

        // JPQL Estática
        em.createQuery("DELETE FROM EventoMusical e WHERE e.id = 2").executeUpdate();

        // JPQL Dinámica
        Query qDelete = em.createQuery("DELETE FROM EventoMusical e WHERE e.id = :id");
        qDelete.setParameter("id", 2L);
        qDelete.executeUpdate();
        em.getTransaction().commit();

        em.close();
    }
}