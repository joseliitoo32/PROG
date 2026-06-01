import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

public class TestEvento {
    public static void main(String[] args) {
        EventoMusical evento = new EventoMusical();
        evento.setNombre("Concierto");
        evento.setFecha(new Date());
        evento.setRecaudacion(new BigDecimal("1500.50"));
    }
}