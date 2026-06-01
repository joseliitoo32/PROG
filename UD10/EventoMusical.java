import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class EventoMusical implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen")
    @SequenceGenerator(name = "gen", initialValue = 10, allocationSize = 10)
    private Long id;

    private String nombre;
    @Temporal(TemporalType.DATE) private Date fecha;
    private BigDecimal recaudacion;

    @ElementCollection
    private List<String> artistas;

    @Transient
    private int control;

    public EventoMusical() {} // Obligatorio para JPA

    public EventoMusical(String nombre, Date fecha, BigDecimal recaudacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
    }

    // Getters y Setters necesarios
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}