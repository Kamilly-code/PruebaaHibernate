package entidades;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "DETALLE_ORDENES")
public class DetalleOrdene {
    @EmbeddedId
    private DetalleOrdeneId id;

    @MapsId("ordenid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "ORDENID", nullable = false)
    private Ordene ordenid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "PRODUCTOID", nullable = false)
    private Producto productoid;

    @Column(name = "CANTIDAD", nullable = false)
    private Long cantidad;

    public DetalleOrdeneId getId() {
        return id;
    }

    public void setId(DetalleOrdeneId id) {
        this.id = id;
    }

    public Ordene getOrdenid() {
        return ordenid;
    }

    public void setOrdenid(Ordene ordenid) {
        this.ordenid = ordenid;
    }

    public Producto getProductoid() {
        return productoid;
    }

    public void setProductoid(Producto productoid) {
        this.productoid = productoid;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetalleOrdene{" +
                "id=" + id +
                ", ordenid=" + ordenid +
                ", productoid=" + productoid +
                ", cantidad=" + cantidad +
                '}';
    }
}