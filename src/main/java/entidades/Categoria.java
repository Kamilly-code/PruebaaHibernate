package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CATEGORIAS")
public class Categoria {
    @Id
    @Column(name = "CATEGORIAID", nullable = false)
    private Long id;

    @Column(name = "NOMBRECAT", nullable = false, length = 50)
    private String nombrecat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrecat() {
        return nombrecat;
    }

    public void setNombrecat(String nombrecat) {
        this.nombrecat = nombrecat;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nombrecat='" + nombrecat + '\'' +
                '}';
    }

}