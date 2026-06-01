import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventos.odb");
        EntityManager em = emf.createEntityManager();

        // EJERCICIO 4: Insertar
        em.getTransaction().begin();
        EventoMusical e1 = new EventoMusical("Evento 1", new Date(), new BigDecimal("100"));
        EventoMusical e2 = new EventoMusical("Evento 2", new Date(), new BigDecimal("200"));
        em.persist(e1);
        em.persist(e2);
        em.getTransaction().commit();

        // EJERCICIO 5, 6, 7 (Ejemplo de consulta dinámica)
        em.getTransaction().begin();
        // Obtener el primero (id=10 según tu configuración)
        EventoMusical ev = em.find(EventoMusical.class, 10L);
        if (ev != null) {
            ev.setNombre(ev.getNombre().toUpperCase()); // Ejercicio 6
        }
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}