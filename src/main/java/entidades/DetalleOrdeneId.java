package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DetalleOrdeneId implements Serializable {
    private static final long serialVersionUID = 4068478238900795403L;

    @Column(name = "ORDENID", nullable = false)
    private Long ordenid;

    @Column(name = "DETALLEID", nullable = false)
    private Long detalleid;

    public Long getOrdenid() {
        return ordenid;
    }

    public void setOrdenid(Long ordenid) {
        this.ordenid = ordenid;
    }

    public Long getDetalleid() {
        return detalleid;
    }

    public void setDetalleid(Long detalleid) {
        this.detalleid = detalleid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetalleOrdeneId that = (DetalleOrdeneId) o;
        return Objects.equals(ordenid, that.ordenid) &&
                Objects.equals(detalleid, that.detalleid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordenid, detalleid);
    }

    @Override
    public String toString() {
        return "DetalleOrdeneId{" +
                "ordenid=" + ordenid +
                ", detalleid=" + detalleid +
                '}';
    }
}