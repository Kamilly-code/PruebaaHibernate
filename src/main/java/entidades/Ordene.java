package entidades;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Entity
@Table(name = "ORDENES")
public class Ordene {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDENID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENTEID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EMPLEADOID", nullable = false)
    private Empleado empleadoid;

    @Column(name = "FECHAORDEN", nullable = false)
    private LocalDate fechaorden;

    @Column(name = "DESCUENTO")
    private Long descuento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleadoid() {
        return empleadoid;
    }

    public void setEmpleadoid(Empleado empleadoid) {
        this.empleadoid = empleadoid;
    }

    public LocalDate getFechaorden() {
        return fechaorden;
    }

    public void setFechaorden(LocalDate fechaorden) {
        this.fechaorden = fechaorden;
    }

    public Long getDescuento() {
        return descuento;
    }

    public void setDescuento(Long descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Ordene{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", empleadoid=" + empleadoid +
                ", fechaorden=" + fechaorden +
                ", descuento=" + descuento +
                '}';
    }
}
