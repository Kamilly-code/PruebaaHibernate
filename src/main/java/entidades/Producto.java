package entidades;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "PRODUCTOS")
public class Producto {
    @Id
    @Column(name = "PRODUCTOID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "PROVEEDORID", nullable = false)
    private entidades.Proveedore proveedorid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "CATEGORIAID", nullable = false)
    private Categoria categoriaid;

    @Column(name = "DESCRIPCION", length = 50)
    private String descripcion;

    @Column(name = "PRECIOUNIT", nullable = false)
    private Long preciounit;

    @Column(name = "EXISTENCIA", nullable = false)
    private Long existencia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public entidades.Proveedore getProveedorid() {
        return proveedorid;
    }

    public void setProveedorid(entidades.Proveedore proveedorid) {
        this.proveedorid = proveedorid;
    }

    public Categoria getCategoriaid() {
        return categoriaid;
    }

    public void setCategoriaid(Categoria categoriaid) {
        this.categoriaid = categoriaid;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getPreciounit() {
        return preciounit;
    }

    public void setPreciounit(Long preciounit) {
        this.preciounit = preciounit;
    }

    public Long getExistencia() {
        return existencia;
    }

    public void setExistencia(Long existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", proveedorid=" + proveedorid +
                ", categoriaid=" + categoriaid +
                ", descripcion='" + descripcion + '\'' +
                ", preciounit=" + preciounit +
                ", existencia=" + existencia +
                '}';
    }
}