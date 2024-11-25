package entidades;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Entity
@Table(name = "EMPLEADOS")
public class Empleado {
    @Id
    @Column(name = "EMPLEADOID", nullable = false)
    private Long id;

    @Column(name = "NOMBRE", length = 30)
    private String nombre;

    @Column(name = "APELLIDO", length = 30)
    private String apellido;

    @Column(name = "FECHA_NAC")
    private LocalDate fechaNac;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "REPORTA_A")
    private Empleado reportaA;

    @Column(name = "EXTENSION")
    private Long extension;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Empleado getReportaA() {
        return reportaA;
    }

    public void setReportaA(Empleado reportaA) {
        this.reportaA = reportaA;
    }

    public Long getExtension() {
        return extension;
    }

    public void setExtension(Long extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNac=" + fechaNac +
                ", reportaA=" + reportaA +
                ", extension=" + extension +
                '}';
    }
}